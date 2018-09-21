package com.farukecza.eczacrm.service;

import java.util.Optional;

public interface ServiceBase<T>
{
    Iterable<T> getAll();
    Optional<T> findById(int id);
    T save(T entity);
    void deleteById(int id);
    void delete(T entity);
}
