package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Role;
import com.farukecza.eczacrm.entity.User;
import com.farukecza.eczacrm.repository.RoleRepository;
import com.farukecza.eczacrm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

@Controller
public class RegistrationController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/registration")
    public String index(){

        return "registration";
    }

    @PostMapping("/registration")
    public String save(){

        Role r = new Role();
        r.setName("Administrators");
        roleRepository.save(r);
        return "redirect:/login";
    }
}
