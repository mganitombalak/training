package com.aerotivelabs;

public class Personel implements IEntity{
    private int id;
    private String firstName;
    private String lastName;
    private String title;
    private Deparment department;

    private Personel() {
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public Deparment getDepartment() {
        return department;
    }

    private void setDepartment(Deparment department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return id + "-" + firstName + " " + lastName + "(" + title + ")" + "-" + department.getName();
    }

    public static class Builder {

        private Personel instance;

        public Builder() {
            this.instance = new Personel();
        }

        public Builder withId(int id) {
            this.instance.setId(id);
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.instance.setFirstName(firstName);
            return this;
        }

        public Builder withLastName(String lastName) {
            this.instance.setLastName(lastName);
            return this;
        }

        public Builder withTitle(String title) {
            this.instance.setTitle(title);
            return this;
        }

        public Builder withDepartment(int id, String name) {
            this.instance.setDepartment(new Deparment(id, name));
            return this;
        }

        public Personel build() {
            return this.instance;
        }

    }
}
