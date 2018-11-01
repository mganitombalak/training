package com.farukecza.eczacrm.repository;


import com.farukecza.eczacrm.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

}
