package com.farukecza.eczacrm.controller;

import com.farukecza.eczacrm.entity.Category;
import com.farukecza.eczacrm.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/category")
public class CategoryController extends BaseController<CategoryService, Category>{
    public CategoryController() {
        this.viewBase="category";
    }
}
