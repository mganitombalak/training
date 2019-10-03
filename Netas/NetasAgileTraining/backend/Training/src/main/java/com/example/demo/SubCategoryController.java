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
public class SubCategoryController extends BaseController{
	@Autowired
	private SubCategoryService subCategoryService;
	
	@PostMapping("{categoryId}/subcategory")
	private ResponseEntity<SubCategory> saveSubCategory(@PathVariable("categoryId") int categoryId,@RequestBody SubCategory subCategory) {

		SubCategory createdCategory = subCategoryService.saveOrUpdate(categoryId,subCategory);

		return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
	}

	@GetMapping("{categoryId}/subcategory/{id}")
	private ResponseEntity<SubCategory> getSubCategory(@PathVariable("id") int id) {

		SubCategory createdCategory = subCategoryService.getCategory(id);

		return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
	}
}
