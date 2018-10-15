package com.ykb.planet.repository;

import com.ykb.planet.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {
    List<Department> findDepartmentByNameLike(String keyword);
}
