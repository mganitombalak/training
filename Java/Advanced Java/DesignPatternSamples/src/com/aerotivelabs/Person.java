package com.aerotivelabs;

public class Person {
    public static class Builder{
        Person person;

        public Builder() {
            this.person = new Person();
        }
        public Builder setFirstName(String firstName){
            person.firstName=firstName;
            return this;
        }
        public Builder setLasttName(String lasttName){
            person.firstName=lasttName;
            return this;
        }
        public Person build(){
            return person;
        }
    }

    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
