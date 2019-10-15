package aero.tav.tavapi.controller;

import aero.tav.tavapi.entity.Product;
import aero.tav.tavapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(int id, Product c){
        c.setId(id);
        System.out.println("Product " + id +" has been updated.");
        productService.upsert(c);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id){
        productService.delete(id);
    }
}
