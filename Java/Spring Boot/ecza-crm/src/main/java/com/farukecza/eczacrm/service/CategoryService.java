package com.farukecza.eczacrm.service;

import com.farukecza.eczacrm.entity.Category;
import com.farukecza.eczacrm.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ServiceBase<Category>{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }
}
