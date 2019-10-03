package aero.tav.log;

import org.springframework.stereotype.Component;

@Component
public class ElasticLogger implements Logger{
    public void log(String msg){
        System.out.println("ElasticSearch logger:" + msg);
    }
}
