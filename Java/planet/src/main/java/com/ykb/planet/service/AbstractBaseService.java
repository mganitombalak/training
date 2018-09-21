package com.ykb.planet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class AbstractBaseService<R extends CrudRepository,T> implements BaseService<T> {

    protected R repository;

    public AbstractBaseService(R repository) {
        this.repository = repository;
    }

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


}
