package com.ykb.controllers;

import com.ykb.dao.EmployeeDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    private EmployeeDAOImpl employeeRepo;

    public HomeController(EmployeeDAOImpl employeeRepo) {
        this.employeeRepo = new EmployeeDAOImpl();
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("employees", employeeRepo.getAll());
        return "home";
    }
}