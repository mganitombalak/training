package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category saveOrUpdate(Category category) {
		Category categorySaved = categoryRepository.save(category);
		categorySaved.setResoruceUrl(generateResourceUrlPost(categorySaved.getId()));
		return categorySaved;
	}
	
	public Category getCategory(Integer id) {
		Category categorySaved = categoryRepository.findById(id).get();
		categorySaved.setResoruceUrl(generateResourceUrlPost(categorySaved.getId()));
		return categorySaved;
	}
	
	public Iterable<Category> getAllCategory() {
		Iterable<Category> categorySaved = categoryRepository.findAll();
		return categorySaved;
	}

	private String generateResourceUrlPost(Integer id) {
		return "/agileTraining/v1/category/" + id.toString();
	}
}
