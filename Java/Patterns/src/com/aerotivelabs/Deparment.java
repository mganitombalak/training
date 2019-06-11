package com.aerotivelabs;

public class Deparment implements IEntity{
    private int id;
    private String name;

    private Deparment() {
    }

    Deparment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  getId() + "-" + getName();
    }

    public static class Builder {
        private Deparment instance;

        public Builder() {
            this.instance = new Deparment();
        }

        public Builder withId(int id){
            this.instance.setId(id);
            return this;
        }

        public Builder withName(String name){
            this.instance.setName(name);
            return this;
        }

        public Deparment build()
        {
            return this.instance;
        }
    }
}
