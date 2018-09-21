package com.ykb.planet.controllers;

import com.ykb.planet.entity.Department;
import com.ykb.planet.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/department")
    public String index(Model model) {
        model.addAttribute("departments", departmentService.findAll());
        return "department/index";
    }

    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
    public String update(@PathVariable(required = true) int id, Model model) {
        model.addAttribute("department", departmentService.findById(id));
        return "department/update";
    }

    @PostMapping("/department/save")
//    @RequestMapping(value = "/department/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Department d) {
        Department updated = departmentService.save(d);
        return "redirect:/department";
    }

    @GetMapping("/department/delete/{id}")
//    @RequestMapping(value = "/department/save", method = RequestMethod.POST)
    public String delete(@PathVariable int id,Model model) {
        Optional<Department> gonnaBeDeletedEntity =departmentService.findById(id);
        gonnaBeDeletedEntity.ifPresent(department -> {
            model.addAttribute("department",department);
        });
        return "department/delete";
    }
    @PostMapping("/department/delete")
//    @RequestMapping(value = "/department/save", method = RequestMethod.POST)
    public String delete(@ModelAttribute Department d) {
        departmentService.delete(d.getId());
        return "redirect:/department";
    }
}
