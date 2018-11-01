package com.farukecza.eczacrm.repository;


import com.farukecza.eczacrm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String userName);
}
