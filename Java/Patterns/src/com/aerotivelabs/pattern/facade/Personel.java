package com.aerotivelabs.pattern.facade;

public class Personel {
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void save()
    {
        System.out.println(this.id + "-" + this.firstName + " " + this.lastName + " has been saved");
    }
}
