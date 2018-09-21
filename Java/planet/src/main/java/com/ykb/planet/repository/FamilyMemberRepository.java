package com.ykb.planet.repository;

import com.ykb.planet.entity.FamilyMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyMemberRepository extends CrudRepository<FamilyMember,Integer> {
}
