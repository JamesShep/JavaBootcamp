package com.coderscampus.lesson1;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {

    public static void main(String[] args) {

        // Key = Social Security Number (SSN)
        // Value = Persons Name

        Map<Integer, String> people = new HashMap<>();

        // HashMaps store data as Key / Value pairs
        //                         K / V

        people.put(111111111, "James Sheppard");
        people.put(222222222, "Trevor Page");
        people.put(333333333, "Elon Musk");
        people.put(444444444, "Jeff Bezos");
        people.put(555555555, "Alyssa Vance");

        System.out.println("Get data using an invalid key: ");
        System.out.println(people.get(123456789));

        System.out.println("Get data using a valid key: ");
        System.out.println(people.get(333333333));

    }

}
