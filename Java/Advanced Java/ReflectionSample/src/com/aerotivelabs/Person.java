package com.aerotivelabs;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Serializable {
    private int id;
    private String name;
    private String title;
    private Date birthDate;

    public Person(int id, String name, String title, String birthDate) {
        this.id = id;
        this.name = name;
        this.title = title;
        try {
            this.setBirthDate(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBirthDate() {
        SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy");
        return df.format(birthDate);
    }

    public void setBirthDate(String birthDate) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy");
        this.birthDate = df.parse(birthDate);
    }

    public String toString(){
        SimpleDateFormat df = new SimpleDateFormat("MMM d, yyyy");
        return title + " " + name + " born " + df.format(birthDate);
    }
}
