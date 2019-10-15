package aero.tav.springbootmvc.controller;

import aero.tav.springbootmvc.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public abstract class BaseController<E,S extends BaseService<E>> {
    @Autowired
    protected S service;
    protected String viewBase;
    protected Class<E> type;
    protected boolean hasDependentData;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute(viewBase, service.getAll());
        return viewBase + "/index";
    }

    @RequestMapping(value = {"/upsert", "/upsert/{id}"}, method = RequestMethod.GET)
    public String saveView(@PathVariable(required = false) Integer id, Model model) throws IllegalAccessException, InstantiationException {
        model.addAttribute(viewBase, id == null ?
                type.newInstance() :
                service.findById(id));
        model.addAttribute("entity",viewBase);
        return viewBase + "/upsert";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute E entity) {
        service.save(entity);
        return "redirect:/" + viewBase;
    }

    @GetMapping(path = "/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        Optional<E> entity = service.findById(id);
        entity.ifPresent(e -> model.addAttribute(viewBase, e));
        model.addAttribute("entity",viewBase);
        return viewBase + "/deleteConfirmation";
    }

    @PostMapping("/delete")
    public String deleteConfirmed(@ModelAttribute E entity) {
        service.delete(entity);
        return "redirect:/" + viewBase;

    }

}
