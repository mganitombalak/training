package com.aerotivelabs;

public class Account {

    private int Id;
    private String firstName;
    private String lastName;
    private float balance;

    public Account setId(int id) {
        Id = id;
        return this;
    }

    public Account setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Account setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Account setBalance(float balance) {
        this.balance = balance;
        return this;
    }
}
