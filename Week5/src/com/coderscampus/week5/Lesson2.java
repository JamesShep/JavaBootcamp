package com.coderscampus.week5;

public class Lesson2 {
    public String someVariable = "Hi There";

    // Access Modifiers = private, public, protected
    //can be on a class, method of variable

    public static void main(String[] args) {

        Human jamesSheppard = new Human();
        jamesSheppard.setAge(-1);
        System.out.println(jamesSheppard.getAge());
        jamesSheppard.setAge(160);
        System.out.println(jamesSheppard.getAge());
        jamesSheppard.setAge(26);
        System.out.println(jamesSheppard.getAge());
        // jamesSheppard.age = 26;
    }
}
