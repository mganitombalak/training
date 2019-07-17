package com.aerotivelabs.pattern.facade;


public class DoorSecurity {
    private int id;
    private int personalId;
    private boolean isAuthorized;

    public DoorSecurity(int id, int personalId, boolean isAuthorized) {
        this.id = id;
        this.personalId = personalId;
        this.isAuthorized = isAuthorized;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public void save() {
        System.out.println("The door " + this.id + " access is " + (this.isAuthorized ? " granted" : " not granted") + " to " + this.personalId);
    }

    public static int[] getDoors()
    {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
