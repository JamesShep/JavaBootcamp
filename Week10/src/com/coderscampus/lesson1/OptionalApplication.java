package com.coderscampus.lesson1;

import java.util.Optional;

public class OptionalApplication {

    public static void main(String[] args) {

        // Lesson 1
        Optional<String> fullName = Optional.of("James Sheppard");

        System.out.println(fullName);

        String james = fullName.get();

        System.out.println(james);

        // Lesson 2
        Recipe cookies = new Recipe();
        cookies.setName("Chocolate Chip Cookies");
        cookies.setInstructions("\n1: Pre-heat oven\n2: Put dough on baking sheet\n" +
                "3: Cook dough for 15 minutes");

        System.out.println(cookies);
    }

}
