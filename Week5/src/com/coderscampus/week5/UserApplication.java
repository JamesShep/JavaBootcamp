package com.coderscampus.week5;

public class UserApplication {

    public static void main(String[] args) {
        UserService userService = new UserService();


        User jamesUser = userService.createUser("test@email.com", "password123");
        System.out.println(jamesUser);
    }
}
