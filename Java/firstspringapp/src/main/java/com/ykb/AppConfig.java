package com.ykb;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean("logger")
    public Logger logger(){
        return new OracleLogger();
    }

//    @Bean("mbo")
//    public MyCompexBusinessObject myCompexBusinessObject(){
//        return new MyCompexBusinessObject();
//    }
}
