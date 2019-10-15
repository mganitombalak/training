package aero.tav.springbootmvc.controller;

import aero.tav.springbootmvc.entity.Category;
import aero.tav.springbootmvc.entity.Product;
import aero.tav.springbootmvc.repository.CategoryRepository;
import aero.tav.springbootmvc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseDependentController<Product,Category ,ProductService<Category,CategoryRepository>> {
    public ProductController() {
        this.viewBase = "product";
        this.type = Product.class;
        this.hasDependentData=true;
    }
}
