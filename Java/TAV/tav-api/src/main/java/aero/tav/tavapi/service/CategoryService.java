package aero.tav.tavapi.service;

import aero.tav.tavapi.entity.Category;
import aero.tav.tavapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements BaseService<Category> {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category upsert(Category entity) {
        return categoryRepository.save(entity);
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
