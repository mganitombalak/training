package aero.tav.cache;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class DefaultCache implements Cache{

    public void cache(String key, Object value) {
        System.out.println("Default cache:" + key + " -> " + value);
    }
}
