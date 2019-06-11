package com.aerotivelabs;

public enum ItemType {
    Stationery("Staionery Item"),
    OfficeElectronics("Small electronic office tools"),
    Electronics("General electronic tool");

    public String getDesciption() {
        return desciption;
    }

    private String desciption;

    ItemType(String desc) {
        this.desciption = desc;
    }
}
