package com.sqills;

import java.util.Set;
import java.util.stream.Collectors;

public class EntityManager<T extends Common> {

    private Set<T> data;

    public EntityManager(Set<T> data) {
        this.data = data;
    }

    public Set<T> findAll(){
        return data;
    }

    public Set<T> findByName(String name){
        return data.stream().filter(item->item.getName().equals(name)).collect(Collectors.toSet());
    }

    public Set<T> findByKeyword(String keyword){
        return data.stream().filter(item->item.toString().contains(keyword)).collect(Collectors.toSet());
    }
}
