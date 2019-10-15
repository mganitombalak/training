package aero.tav.springbootmvc.controller;

import aero.tav.springbootmvc.entity.Category;
import aero.tav.springbootmvc.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController extends BaseController<Category,CategoryService> {
    public CategoryController() {
        this.viewBase = "category";
        this.type = Category.class;
    }
}
