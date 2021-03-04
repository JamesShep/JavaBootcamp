package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("James Sheppard");
        names.add("Trevor Page");
        names.add("Elon Musk");
        names.add("Trudy Hamilton");
        names.add("Jeff Bezos");
        names.add("Alex Stewart");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        // example 1 of creating lamba expression
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

        // example 2, slightly more "verbose"
        Collections.sort(names, (String o1, String o2) -> o2.compareTo(o1));

        // example 3, even more "verbose", note: not the same functionality as above
        // because we are doing some null checks
        Collections.sort(names, (String o1, String o2) -> {
            if (o2 != null && o1 != null) {
                return o2.compareTo(o1);
            } else {
                return 0;
            }

        });

        // example 4,
        Collections.sort(names, Comparator.reverseOrder());

        printArrayListToConsole(names);






        //example1();

    }

    private static void example1() {
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
