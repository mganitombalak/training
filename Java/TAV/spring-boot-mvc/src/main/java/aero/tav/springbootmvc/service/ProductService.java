package aero.tav.springbootmvc.service;

import aero.tav.springbootmvc.entity.Product;
import aero.tav.springbootmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService<D,R extends CrudRepository<D,Integer>> implements BaseDependentService<Product,D > {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private R dependentRepository;

    @Override
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Iterable<D> getDependentData() {
        return dependentRepository.findAll();
    }


    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }
}
