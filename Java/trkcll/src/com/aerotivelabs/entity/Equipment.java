package com.aerotivelabs.entity;

public class Equipment implements IEntity {
    private int id;
    private String name;
    private int age;
    private double price;

    public Equipment(int id, String name, int age, double price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean keyword(String keyword) {
        return this.toString().contains(keyword);
    }
}
