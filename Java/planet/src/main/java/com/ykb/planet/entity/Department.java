package com.ykb.planet.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", nullable = false,length = 64)
    private String name;

    @Column(name="departmentCode", nullable = true,length = 16)
    private String deparmentCode;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "department")
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public Department() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparmentCode() {
        return deparmentCode;
    }

    public void setDeparmentCode(String deparmentCode) {
        this.deparmentCode = deparmentCode;
    }
}
