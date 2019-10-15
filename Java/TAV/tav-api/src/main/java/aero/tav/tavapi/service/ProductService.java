package aero.tav.tavapi.service;

import aero.tav.tavapi.entity.Product;
import aero.tav.tavapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements BaseService<Product> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product upsert(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

}
