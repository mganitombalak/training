package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public abstract class BaseController<T extends ServiceBase,P> {

    @Autowired
    private T service;
    protected String viewBase;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute(viewBase, service.getAll());
        return viewBase+"/index";
    }

    @RequestMapping(value= {"/createorupdate","/createorupdate/{id}"},method = RequestMethod.GET)
    public String saveView(@PathVariable(required = false) Integer id, Model model) {
        model.addAttribute(viewBase,
                id == null ?
                        new Object():
                        service.findById(id));
        return viewBase+"/upsert";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute P entity) {
        service.save(entity);
        return "redirect:/"+viewBase;
    }

    @GetMapping(path = "/delete/{id}")
    public String delete(@PathVariable("id") int id,Model model) {
        Optional<P> c = service.findById(id);
        c.ifPresent(entity->model.addAttribute(viewBase, entity));
        return viewBase+"/info";
    }

    @PostMapping(path = "/delete")
    public String deleteConfirmed(@ModelAttribute P c) {
        service.delete(c);
        return "redirect:/"+viewBase;
    }
}
