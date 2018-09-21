package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Category;
import com.farukecza.eczacrm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("categories", categoryService.getAll());
        return "category/index";
    }

    @RequestMapping(value= {"/createorupdate","/createorupdate/{id}"},method = RequestMethod.GET)
    public String saveView(@PathVariable(required = false) Integer id, Model model) {
        model.addAttribute("category",
                id == null ?
                        new Category() :
                        categoryService.findById(id));
        return "category/upsert";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Category category) {
        categoryService.save(category);
        return "redirect:/category";
    }

    @GetMapping(path = "/delete/{id}")
    public String delete(@PathVariable("id") int id,Model model) {
        Optional<Category> c = categoryService.findById(id);
        c.ifPresent(category->model.addAttribute("category", category));
        return "category/info";
    }

    @PostMapping(path = "/delete")
    public String deleteConfirmed(@ModelAttribute Category c) {
        categoryService.delete(c);
        return "redirect:/category";
    }
}
