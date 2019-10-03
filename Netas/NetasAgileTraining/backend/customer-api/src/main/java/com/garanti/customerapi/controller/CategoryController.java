package com.garanti.customerapi.controller;

import com.garanti.customerapi.entity.Category;
import com.garanti.customerapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @RequestMapping("")
    public Iterable<Category> index(){
        return service.findAll();
    }
}
