package com.ykb.planet.service;

import com.ykb.planet.entity.Person;
import com.ykb.planet.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends AbstractBaseService<PersonRepository,Person> {
//
    @Autowired
    public PersonService(PersonRepository repository) {
        super(repository);
    }
}
