package com.farukecza.eczacrm.service;

import com.farukecza.eczacrm.entity.Customer;
import com.farukecza.eczacrm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ServiceBase<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer entity) {
        return customerRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void delete(Customer entity) {
        customerRepository.delete(entity);
    }
}
