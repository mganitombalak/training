package com.farukecza.eczacrm.repository;

import com.farukecza.eczacrm.entity.Producer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends CrudRepository<Producer,Integer> {
}
