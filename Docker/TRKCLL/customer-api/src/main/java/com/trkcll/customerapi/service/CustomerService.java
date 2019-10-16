package com.trkcll.customerapi.service;

import com.trkcll.customerapi.entity.Customer;
import com.trkcll.customerapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> findAll(){
        return repository.findAll();
    }
}
