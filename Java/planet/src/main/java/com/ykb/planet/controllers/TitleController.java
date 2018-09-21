package com.ykb.planet.controllers;

import com.ykb.planet.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TitleController {

    @Autowired
    private TitleService titleService;

    @GetMapping("/title")
    public String index(Model model){
        model.addAttribute("titles",titleService.findAll());
        return "title/index";
    }
}
