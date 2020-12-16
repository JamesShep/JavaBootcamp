package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {

    public static void main (String [] args) {

        // Class -> Blueprint for an Object
        // Object -> a Noun, it's an instantiation of a Class

        //Data type, variable name, variable name, assignment operation

        /*Random random = new Random();

        for (int i = 0; i < 20; i++) {
            System.out.println("Random number is: " + (random.nextInt(10)+1));
        }

         */
        //calls the no argument constructor
        Human someOtherHuman = new Human();

        //calls the 4 argument constructor
        Human jamesSheppard = new Human("male", "6'2\"", "185", "hazel");

        System.out.println(jamesSheppard.getInfo());

        Human elonMusk = new Human("male", "6'1\"", "90", "blue");

        System.out.println(elonMusk.getInfo());

        Human humanFemale = new Human("female", "5'5\"", "55", "brown");

        System.out.println(humanFemale.getInfo());
    }
}
