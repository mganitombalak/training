package com.ykb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("cbo")
@Scope("prototype")
public class MyCompexBusinessObject {

    // FIELD INJECTION @Autowired
    private Logger logger;
    private CacheManager cache;

    private String connectionString;

    //CONSTRUCTOR INJECTION
    public MyCompexBusinessObject(
            @Qualifier("oracleLogger") Logger logger,
            CacheManager cache) {
        this.logger = logger;
        this.cache = cache;
    }

    public void doSomethingComplex() {
        System.out.println("complex things happening!");
        this.cache.cache("complexobject", new Object());
        this.logger.log("complex things done!");
    }

    //SETTER INJECTION
//    public void setLogger(Logger logger) {
//        this.logger = logger;
//    }

    public String getConnectionString() {
        return connectionString;
    }

    @Value("${myapp.connectionString}")
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
