package aero.tav.tavapi.controller;

import aero.tav.tavapi.entity.Category;
import aero.tav.tavapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

//    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public Iterable<Category> findAll(){

        return categoryService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category create(@RequestBody Category c){
        return categoryService.upsert(c);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable int id, @RequestBody Category c, HttpServletResponse response){
        if(id<0)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Identity is out of range",null);
        //c.setId(id);
        System.out.println("Product " + id +" has been updated.");
        categoryService.upsert(c);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }

}
