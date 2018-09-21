package com.ykb.planet.service;

import com.ykb.planet.entity.Department;
import com.ykb.planet.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends AbstractBaseService<DepartmentRepository, Department> {

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        super(repository);
    }
}
