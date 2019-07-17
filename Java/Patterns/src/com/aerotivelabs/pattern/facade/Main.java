package com.aerotivelabs.pattern.facade;

public class Main {
    public static void main(String[] args) {
        PersonelWithSecurityFacade f = new PersonelWithSecurityFacade();
        f.CreatePersonalWithSecurityAuthorization("Gani","Tombalak", DoorSecurity.getDoors());
    }
}
