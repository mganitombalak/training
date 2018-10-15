package com.ykb.planet.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable = false,length = 64)
    private String name;

    @Column(name = "departmentCode",nullable = true,length = 16)
    private String code;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "department")
    private List<Personal> personalList;

}
