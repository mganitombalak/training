package com.ykb.planet.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstName", nullable = false, length = 128)
    private String firstName;
    @Column(name = "lastName", nullable = false, length = 128)
    private String lastName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id")
    private Department department;
}
