package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryService {
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	@Autowired
	private CategoryService categoryService;

	public SubCategory saveOrUpdate(int categoryId,SubCategory subCategory) {
		//subCategory.setCategory(categoryService.getCategory(categoryId));
		SubCategory subCategorySaved = subCategoryRepository.save(subCategory);
		subCategorySaved.setResoruceUrl(generateResourceUrlPost(subCategorySaved.getSubId()));
		return subCategorySaved;
	}
	
	public SubCategory getCategory(Integer id) {
		SubCategory subCategorySaved = subCategoryRepository.findById(id).get();
		subCategorySaved.setResoruceUrl(generateResourceUrlPost(subCategorySaved.getSubId()));
		return subCategorySaved;
	}

	private String generateResourceUrlPost(Integer id) {
		return "/agileTraining/v1/category/" + id.toString();
	}
}
