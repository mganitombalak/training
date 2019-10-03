package com.aerotivelabs;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {

//      Class personClass = Person.class;
        Class personClass = Class.forName("com.aerotivelabs.Person");
        System.out.println("Canonical Name:" + personClass.getCanonicalName());
        System.out.println("Package Name:" + personClass.getPackage().getName());

        Class[] constParams = {int.class, String.class, String.class, String.class};
        Constructor personConst = personClass.getConstructor(constParams);

        Object[] params = new Object[4];
        params[0] = 1;
        params[1] = "Mehmet Gani";
        params[2] = "Tombalak";
        params[3] = "16/05/1983";

        Person p = (Person) personConst.newInstance(params);
        System.out.println(p);

        //Person p = (Person) personClass.newInstance();
        //System.out.println(p);
    }
}
