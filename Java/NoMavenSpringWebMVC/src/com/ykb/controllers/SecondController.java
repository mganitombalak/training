package com.ykb.controllers;

import com.ykb.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/second")
public class SecondController {

    @GetMapping("")  //@RequestMapping(path = "/",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("person",new Person("MG","T"));
        return "second/index";
    }

    @PostMapping("")  //@RequestMapping(path = "/",method = RequestMethod.POST)
    public String indexPost(@ModelAttribute("person") Person person, Model model){

        model.addAttribute("result",
                "Hello "
                +person.getFirstName() + " "+ person.getLastName());
        return "second/applicationFormResult";
    }

}
