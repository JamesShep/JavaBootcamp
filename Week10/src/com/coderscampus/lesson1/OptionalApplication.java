package com.coderscampus.lesson1;

import java.util.Optional;

public class OptionalApplication {

    public static void main(String[] args) {

        Optional<String> fullName = Optional.of("James Sheppard");

        System.out.println(fullName);

        String james = fullName.get();

        System.out.println(james);
    }

}
