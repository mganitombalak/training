package com.garanti.customerapi.service;


import com.garanti.customerapi.entity.Category;
import com.garanti.customerapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Iterable<Category> findAll(){
        return repo.findAll();
    }

    public Iterable<Category> findByNameContains(String keyword){
        return repo.findByNameContains(keyword);
    }
}
