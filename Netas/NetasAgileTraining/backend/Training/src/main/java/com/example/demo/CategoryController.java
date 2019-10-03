package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController extends BaseController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("")
	private ResponseEntity<Category> saveCategory(@RequestBody Category category) {

		Category createdCategory = categoryService.saveOrUpdate(category);

		return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	private ResponseEntity<Category> getCategory(@PathVariable("id") int id) {

		Category createdCategory = categoryService.getCategory(id);

		return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
	}
	
	@GetMapping("")
	private ResponseEntity<Iterable<Category>> getAllCategory() {

		Iterable<Category> createdCategory = categoryService.getAllCategory();

		return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
	}

}
