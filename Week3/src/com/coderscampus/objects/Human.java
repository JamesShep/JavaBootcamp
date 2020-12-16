package com.coderscampus.objects;

public class Human {

    String gender;
    String height;
    String weight;
    String eyeColour;

    //Constructor -- Name of class, arguments, scope (Don't need a return type)
    Human() {
        System.out.println("A human is being created!");
    }

    Human(String gender, String height, String weight, String eyeColour) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
    }

    // (visibility modifier), return type, method name, parameters, scope

    String getInfo() {
        return "Gender: " + gender + ", Height: " + height + ", Weight: " +
                weight + ", Eye Colour: " + eyeColour;
    }
}
