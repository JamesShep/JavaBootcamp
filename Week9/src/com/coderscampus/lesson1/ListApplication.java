package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {

    public static void main(String[] args) {

        String[] names = new String[4];

        names[0] = "James Sheppard";
        names[1] = "Trevor Page";
        names[2] = "Elon Musk";
        names[3] = "Trudy Hamilton";
        //names[4] = "Jeff Bezos";

        System.out.println("Arrays Example: ");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("------------------");
        System.out.println("");
        // Collections -> Java solution to common data structure problems
        // List (a type of collection)
        // Set (a type of collection)
        // Map (a type of collection)

        List<String> elements = new ArrayList<String>();
        elements.add("James Sheppard");
        elements.add("Trevor Page");
        elements.add("Elon Musk");
        elements.add("Trudy Hamilton");
        elements.add("Jeff Bezos");
        elements.add("Alex Stewart");

        System.out.println("List Example: ");
        printArrayListToConsole(elements);

        elements.remove(1);

        elements.remove("Trudy Hamilton");
        printArrayListToConsole(elements);

    }

    private static void printArrayListToConsole(List<String> elements) {
        for (String element : elements) {
            System.out.println(element);
        }
        System.out.println("");
    }

}
