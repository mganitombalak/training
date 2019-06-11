package com.sqills;

import java.util.function.Supplier;

public class MenuItem<T> {

    private int id;
    private String name;
    private int parentId;
    private int displayOrder;
    private Supplier<T> action;

    public MenuItem(int Id, String name, int parentId, int displayOrder, Supplier<T> action) {
        this.id = Id;
        this.name = name;
        this.parentId = parentId;
        this.displayOrder = displayOrder;
        this.action = action;
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

    public Supplier<T> getAction() {
        return action;
    }

    @Override
    public String toString() {
        return id + "." + name;
    }
}