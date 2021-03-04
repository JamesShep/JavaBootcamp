package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;

public class StreamApplication {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        populateNames(names);

        // standard for loop
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------------");

        // standard lambdas
        names.stream()
                .forEach(name -> System.out.println(name));

        System.out.println("---------------");

        // updated lambdas
        names.forEach(System.out::println);

        System.out.println("---------------");

        // Multi-threaded
        names.parallelStream()
                .forEach(name -> System.out.println(name));
    }

    private static void populateNames(List<String> names) {

        names.add("Nahla Kirkland");
        names.add("Charly Gay");
        names.add("Jamie-Lee Swan");
        names.add("George Mckeown");
        names.add("Misha Ali");
        names.add("Tanya James");
        names.add("Taybah Wilkinson");
        names.add("Zac Holman");
        names.add("Kacie Dunlap");

    }

}
