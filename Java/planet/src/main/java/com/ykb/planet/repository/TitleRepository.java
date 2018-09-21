package com.ykb.planet.repository;

import com.ykb.planet.entity.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository extends CrudRepository<Title,Integer> {
}
