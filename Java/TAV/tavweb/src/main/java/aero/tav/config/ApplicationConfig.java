package aero.tav.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "aero.tav")
public class ApplicationConfig {
//    @Bean("logger")
//    @Scope("singleton")
//    public Logger logger(){
//        return new ElasticLogger();
//    }
//
//    @Bean("cache")
//    public Cache cache(){
//        return new DefaultCache();
//    }
//
//    @Bean("cbo")
//    public MyComplexBusinessObject complexBusinessObject(){
//        return new MyComplexBusinessObject();
//    }
}
