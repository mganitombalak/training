package com.aerotivelabs.manager;

import com.aerotivelabs.entity.IEntity;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataManager<T extends IEntity> {

    private List<T> data;

    public DataManager(List<T> data) {
        this.data = data;
    }

    public List<T> getAll() {
        return data;
    }

    public List<T> findById(int Id) {
        return data.stream().filter(r -> r.getId() == Id).collect(Collectors.toList());
    }

    public Function<String, List<T>> findByKeyword =
            keyword -> data.parallelStream()
                    .filter(r -> r.toString()
                    .contains(keyword))
                    .collect(Collectors.toList());
}
}
