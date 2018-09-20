package com.ykb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;


@Configuration
public class Config {
    @Bean
    @Scope("prototype")
    public CacheManager getCacheManager() {
        Random r = new Random();
        int value = r.nextInt(100) + 1;
        System.out.println("mem util(%):" + value);
        if (value > 80) {
            return new RedisCacheManagerImpl();
        } else {
            return new LocalCacheManagerImpl();
        }
    }
}
