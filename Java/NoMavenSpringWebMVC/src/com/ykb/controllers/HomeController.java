package com.ykb.controllers;


import com.ykb.entity.Department;
import com.ykb.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    public HomeController() {
        this.departmentRepository =new DepartmentRepository();
    }

    private DepartmentRepository departmentRepository;

    @RequestMapping("/")
    public String index(Model model){

        List<Department> l =departmentRepository.getAll();
        model.addAttribute("departments",l);
        return "home";
    }
}
