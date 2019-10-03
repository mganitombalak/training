package aero.tav.cache;

import org.springframework.stereotype.Component;

@Component
public class RedisCache implements Cache{
    public void cache(String key, Object value) {
        System.out.println("Redis cache:" + key + " -> " + value);
    }
}
