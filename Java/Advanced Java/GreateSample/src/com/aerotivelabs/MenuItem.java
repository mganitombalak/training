package com.aerotivelabs;

import java.util.function.Function;
import java.util.function.Supplier;

public class MenuItem<T> {
    private int id;
    private int parentId;
    private int displayOrder;
    private String name;
    private Supplier<T> action;
    private Function<String,T> stringAction;

    public MenuItem(int id, int parentId, int displayOrder, String name, Supplier<T> action, Function<String, T> stringAction) {
        this.id = id;
        this.parentId = parentId;
        this.displayOrder = displayOrder;
        this.name = name;
        this.action = action;
        this.stringAction = stringAction;
    }

    public Function<String, T> getStringAction() {
        return stringAction;
    }

    public Supplier<T> getAction() {
        return action;
    }

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ". " + name;
    }
}
