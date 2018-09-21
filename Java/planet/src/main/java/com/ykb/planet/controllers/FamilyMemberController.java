package com.ykb.planet.controllers;

import com.ykb.planet.service.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FamilyMemberController {

    @Autowired
    private FamilyMemberService familyMemberService;

    @RequestMapping(path = "/familymembers", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("familyMembers",familyMemberService.findAll());
        return "/familymembers/index";
    }
}
