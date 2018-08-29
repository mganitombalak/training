package com.aerotivelabs;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EntityManager<T extends IEntity<Integer>> {
    private List<T> data;
    public EntityManager(List<T> data) {
        this.data = data;
    }

    public Supplier<List<T>> findAll=()->data;

    public List<T> findById(int id){
        return data.parallelStream().filter(i->i.getId()==id).collect(Collectors.toList());
    }

    public Function<String,List<T>> findByKeyword=keyword-> data.parallelStream().filter(i->i.toString().contains(keyword)).collect(Collectors.toList());
}
