package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Product;
import lombok.var;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {

    @GetMapping("/")
    public String index(){

        return "home";
    }
}
