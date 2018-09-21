package com.ykb.planet.service;

import com.ykb.planet.entity.Title;
import com.ykb.planet.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleService extends AbstractBaseService<TitleRepository, Title>{
    @Autowired
    public TitleService(TitleRepository repository) {
        super(repository);
    }
}
