package aero.tav.business;

import aero.tav.cache.Cache;
import aero.tav.log.Logger;
import aero.tav.log.OracleLogger;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cbo")
public class MyComplexBusinessObject {

    @Qualifier("elasticLogger")
    @Autowired
    private Logger logger;
    @Qualifier("redisCache")
    @Autowired
    private Cache cache;
    
    @Value("${myVar}")
    @Getter
    @Setter
    private String variable;

    public void doSomeComplexThings(){
        System.out.println("Somethings serious is happening");
        this.logger.log("Serious things are happened!");
        this.cache.cache("SeriousObject","Awesome");
    }


    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Cache getCache() {
        return cache;
    }

    public void setCache(Cache cache) {
        this.cache = cache;
    }
}