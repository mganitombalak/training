package com.ykb.planet.service;

import java.util.Optional;

public interface BaseService<T> {
    Iterable<T> findAll();

    T save(T entity);

    void delete(int entityId);

    Optional<T> findById(int entityId);

}
