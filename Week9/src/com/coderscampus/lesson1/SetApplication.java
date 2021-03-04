package com.coderscampus.lesson1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        people.add(new Person(111111111, "James", "Sheppard"));
        people.add(new Person(111111111, "James", "Sheppard"));
        people.add(new Person(111111112, "James", "Sheppard"));

        for (Person  person : people) {
            System.out.println(person);
        }

        // example1();
    }



    private static void printSetToConsole(Set<Integer> elements) {
        for (Integer element : elements) {
            System.out.println(element);
        }
        System.out.println("");
    }

    private static void example1() {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        // LinkedHashset maintains order, HashSet does not

        System.out.println(uniqueNumbers.add(1));
        System.out.println(uniqueNumbers.add(2));
        System.out.println(uniqueNumbers.add(3));
        System.out.println(uniqueNumbers.add(4));
        System.out.println(uniqueNumbers.add(5));
        System.out.println(uniqueNumbers.add(6));
        System.out.println(uniqueNumbers.add(1));

        printSetToConsole(uniqueNumbers);

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("James Sheppard");
        uniqueNames.add("Trevor Page");
        uniqueNames.add("Elon Musk");
        uniqueNames.add("Peter Herbert");

        for ( String element : uniqueNames) {
            System.out.println(element);
        }
        System.out.println("");
    }
}
