package com.aerotivelabs;

import java.util.function.Supplier;

public class MenuItem<T> {
    private int id;
    private int parentId;
    private int displayOrder;
    private String name;
    private Supplier<T> action;

    private MenuItem(){}
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

    @Override
    public String toString() {
        return String.format("%d ) %s", this.getId(), this.getName());
    }

    public Supplier<T> getAction() {
        return action;
    }

    public void setAction(Supplier<T> action) {
        this.action = action;
    }

    public static class Builder<T>{
        private MenuItem instance;
        public Builder() {
            this.instance = new MenuItem();
        }

        public Builder withId(int id){
            instance.setId(id);
            return this;
        }

        public Builder withParentId(int id){
            instance.setParentId(id);
            return this;
        }
        public Builder withDisplayOrder(int id){
            instance.setDisplayOrder(id);
            return this;
        }

        public Builder withName(String name){
            instance.setName(name);
            return this;
        }

        public Builder withAction(Supplier<T> action){
            instance.setAction(action);
            return this;
        }

        public MenuItem build(){
            return instance;
        }
    }

}
