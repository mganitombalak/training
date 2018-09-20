package com.ykb.repository;

import java.util.List;

public interface BaseRepository<T> {
    List<T> getAll();
}
