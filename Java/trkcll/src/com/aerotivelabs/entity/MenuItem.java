package com.aerotivelabs.entity;

import java.util.function.Function;
import java.util.function.Supplier;

public class MenuItem<T> {
    private int id;
    private int parentId;
    private int displayOrder;
    private String name;
    private Supplier<T> action;
    private Function<String,T> faction;

    public MenuItem(int id, int parentId, int displayOrder, String name, Supplier<T> action, Function<String, T> faction) {
        this.id = id;
        this.parentId = parentId;
        this.displayOrder = displayOrder;
        this.name = name;
        this.action = action;
        this.faction = faction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier<T> getAction() {
        return action;
    }

    public Function<String, T> getFaction() {
        return faction;
    }

    public void Display(){
        System.out.println(this.getId() + ") " + this.getName());
    }
}
