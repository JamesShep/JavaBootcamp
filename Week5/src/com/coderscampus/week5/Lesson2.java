package com.coderscampus.week5;

public class Lesson2 {

    // Access Modifiers = private, public, protected
    //can be on a class, method of variable

    public static void main(String[] args) {

        Human jamesSheppard = new Human();
        jamesSheppard.age = 27;

        System.out.println(jamesSheppard.getStageOfLife());

    }
}
