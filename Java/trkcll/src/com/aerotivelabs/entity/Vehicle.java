package com.aerotivelabs.entity;

public class Vehicle implements IEntity{
    private int id;
    private String brand;
    private String model;
    private int modelYear;
    private String plateNumber;

    public Vehicle(int id, String brand, String model, int modelYear, String plateNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.plateNumber = plateNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }

    @Override
    public boolean keyword(String keyword) {
        return this.toString().contains(keyword);
    }
}
