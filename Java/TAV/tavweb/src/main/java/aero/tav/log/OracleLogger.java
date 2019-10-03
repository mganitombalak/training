package aero.tav.log;

import org.springframework.stereotype.Component;

@Component
public class OracleLogger implements Logger{

    public void log(String msg){
        System.out.println("Oracle logger:" + msg);
    }
}
