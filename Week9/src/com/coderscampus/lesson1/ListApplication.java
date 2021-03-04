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

        for (String name : names) {
            System.out.println(name);
        }

        // Collections -> Java solution to common data structure problems
        // List (a type of collection)
        // Set (a type of collection)
        // Map (a type of collection)

        List<String> elements = new ArrayList<String>();
    }

}
