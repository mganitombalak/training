package aero.tav.springbootmvc.repository;

import aero.tav.springbootmvc.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    List<Category> findByNameContains(String keyword);
}
