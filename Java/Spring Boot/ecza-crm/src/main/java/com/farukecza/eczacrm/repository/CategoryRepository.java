package com.farukecza.eczacrm.repository;

import com.farukecza.eczacrm.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    List<Category> findByName(String name);
}
