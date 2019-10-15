package aero.tav.tavapi.service;

public interface BaseService<T> {
    Iterable<T> findAll();
    T upsert(T entity);
    void delete(int id);
}
