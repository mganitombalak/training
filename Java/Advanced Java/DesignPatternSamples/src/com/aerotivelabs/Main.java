package com.aerotivelabs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MySingleton mySingleton= MySingleton.getInstance();
        mySingleton.setValue("Deneme");


        MySingleton mySingleton1= MySingleton.getInstance();
        System.out.println(mySingleton1.getValue());


        Engine e1=EngineFactory.CreateEngine(4);
        Engine e2=EngineFactory.CreateEngine(5);

        System.out.println(e1.fuelType);
        System.out.println(e2.fuelType);

        Person.Builder pb = new Person.Builder();

        Person m=pb.setFirstName("Gani").setLasttName("Mehmet").build();
        System.out.println(m);

        Account a = new Account();
        a.setId(1).setFirstName("Gani").setLastName("Tombalak").setBalance(10f);




    }
}
