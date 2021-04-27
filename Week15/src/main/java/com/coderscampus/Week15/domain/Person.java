package com.coderscampus.Week15.domain;

// Domain objects stored in a database, and retrieved from database

// DTO = transfer data from one object/API to another

public class Person {

    private String firstName;
    private String lastName;
    private Integer Id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Id=" + Id +
                '}';
    }
}
