package com.farukecza.eczacrm.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String socialSecurityNumber;
    @Column(length = 128)
    private String firstName;
    @Column(length = 128)
    private String lastName;
    @Column(length = 1024)
    private String Address;
}
