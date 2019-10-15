package aero.tav.springbootmvc.service;

public interface BaseDependentService<T,D>  extends BaseService<T> {

    Iterable<D> getDependentData();
}
