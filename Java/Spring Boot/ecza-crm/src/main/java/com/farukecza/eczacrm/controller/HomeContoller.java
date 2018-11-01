package com.farukecza.eczacrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeContoller {

    @GetMapping("/")
    public String index(){
        return "home";
    }
}
