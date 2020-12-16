package com.coderscampus.week5;

public class UserService {

    // methods that provide helpful functionality

    public User createUser (String username, String password) {

        // Create an object
        // Datatype, variable name, assignment operator

        User user = new User ();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName("John");
        user.setLastName("Doe");
        return user;
    }
}
