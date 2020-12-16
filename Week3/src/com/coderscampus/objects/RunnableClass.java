package com.coderscampus.objects;

public class RunnableClass {

    public static void main (String [] args) {

        // Class -> Blueprint for an Object
        // Object -> a Noun, it's an instantiation of a Class

        //Data type, variable name, variable name, assignment operation

        int someNumber = 39;

        Human jamesSheppard = new Human();

        jamesSheppard.setProperties("male", "6'2\"", "185", "hazel");

        System.out.println(jamesSheppard.getInfo());

        Human elonMusk = new Human();

        elonMusk.setProperties("male", "6'1\"", "90", "blue");

        System.out.println(elonMusk.getInfo());

        Human radhaTurner = new Human();

        radhaTurner.setProperties("female", "5'5\"", "55", "brown");

        System.out.println(radhaTurner.getInfo());
    }
}
