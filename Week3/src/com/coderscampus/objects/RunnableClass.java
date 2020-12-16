package com.coderscampus.objects;

public class RunnableClass {

    public static void main (String [] args) {

        // Class -> Blueprint for an Object
        // Object -> a Noun, it's an instantiation of a Class

        //Data type, variable name, variable name, assignment operation

        int someNumber = 39;

        Human jamesSheppard = new Human();

        jamesSheppard.eyeColour = "hazel";
        jamesSheppard.gender = "male";
        jamesSheppard.height = "6'2\"";
        jamesSheppard.weight = "185";

        System.out.println(jamesSheppard);

        Human elonMusk = new Human();

        elonMusk.eyeColour = "blue";
        elonMusk.gender = "male";
        elonMusk.height = "6'1\"";
        elonMusk.weight = "190";

        System.out.println(elonMusk);

    }
}
