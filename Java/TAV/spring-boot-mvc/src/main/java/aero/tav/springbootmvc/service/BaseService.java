package aero.tav.springbootmvc.service;


import java.util.Optional;

public interface BaseService<T> {
    Iterable<T> getAll();
    Optional<T> findById(int id);
    T save(T entity);
    void deleteById(int id);
    void delete(T entity);

}
