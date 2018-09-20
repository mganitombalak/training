package com.ykb;

public class RedisCacheManagerImpl implements CacheManager {
    public void cache(String key, Object value) {
        System.out.println("REDIS:" + value.toString() + "has been cached with key:" + key);
    }
}
