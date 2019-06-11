package com.aerotivelabs.facade;

import java.util.Arrays;
import java.util.Random;

public class PersonelWithSecurityFacade {

    public void CreatePersonalWithSecurityAuthorization(String firstName,String lastname,int... doors){
        Personel p =  new Personel();
        p.setId(new Random().nextInt()*-1);
        p.setFirstName(firstName);
        p.setLastName(lastname);
        p.save();
        Arrays.stream(doors).forEach(d->{
            DoorSecurity door= new DoorSecurity(p.getId(),d,(d%2==0));
            door.save();
        });
    }
}
