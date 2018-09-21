package com.ykb.planet.service;

import com.ykb.planet.entity.FamilyMember;
import com.ykb.planet.repository.FamilyMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyMemberService extends AbstractBaseService<FamilyMemberRepository, FamilyMember> {

    @Autowired
    public FamilyMemberService(FamilyMemberRepository repository) {
        super(repository);
    }
}
