package com.coderscampus.week5;

// Holds a bunch of instance variables

// POJO = Plain Old Java Object

public class User {

    // Instance variables (declared as private)
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int accountNumber;

    // Getters and Setters for the above instance variables

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
