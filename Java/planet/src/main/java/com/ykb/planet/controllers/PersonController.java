package com.ykb.planet.controllers;

import com.ykb.planet.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController{

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public String index(Model model){
        model.addAttribute("titles",personService.findAll());
        return "person/index";
    }
}
