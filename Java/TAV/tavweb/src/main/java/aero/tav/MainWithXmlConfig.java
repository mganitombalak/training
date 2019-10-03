package aero.tav;

import aero.tav.business.MyComplexBusinessObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithXmlConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext myAppContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MyComplexBusinessObject mcbo = myAppContext.getBean("cbo",MyComplexBusinessObject.class);

        mcbo.doSomeComplexThings();
        System.out.println(mcbo.getVariable());
    }
}
