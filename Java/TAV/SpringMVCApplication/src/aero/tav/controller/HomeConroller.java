package aero.tav.controller;

import aero.tav.dao.EmployeeDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeConroller {

    @Autowired
    private EmployeeDAOImpl repo;

    @GetMapping("")
    public  String index(Model model){
        model.addAttribute("emp",repo.getAll());
        return "home";
    }
}
