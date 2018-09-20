package com.ykb;

public class LocalCacheManagerImpl implements CacheManager {
    public void cache(String key, Object value) {
        System.out.println("LOCAL:" + value.toString() + "has been cached with key:" + key);
    }
}
