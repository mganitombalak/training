package com.farukecza.eczacrm.repository;

import com.farukecza.eczacrm.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
