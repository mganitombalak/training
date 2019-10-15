package aero.tav.springbootmvc.repository;

import aero.tav.springbootmvc.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
