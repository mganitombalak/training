package com.ykb.planet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping("")
    public String index(){

        String.
        List<String> g= new ArrayList<>();
        g.parallelStream().forEach();
        return "department/index";
    }
}
