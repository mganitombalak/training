package com.ykb.planet.service;

import com.ykb.planet.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class AbstractBaseService <R extends CrudRepository,T> implements BaseService<T>{

    @Autowired
    protected R repository;

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T save(T entity) {
        return (T) repository.save(entity);
    }

    @Override
    public void delete(int entityId) {
        repository.deleteById(entityId);
    }

    @Override
    public Optional<T> findById(int entityId) {
        return repository.findById(entityId);
    }

    @Override
    public List<T> findByNameLike(String keyword) {
        return (repository instanceof DepartmentRepository)?
                (List<T>) ((DepartmentRepository)repository).findDepartmentByNameLike(keyword) :
                null;
    }
}