package com.coderscampus.week5;

public class StaticExample {

    // Static = belongs to the class, not the instance of the class
    // Non-static = belongs to the instance of the class (Not the class itself)

    int someNumber = 10; // non-static
    public static void main(String[] args) {

        StaticExample staticObject = new StaticExample(); // creating an instance for non stattic
        if (staticObject.someNumber > 11) {
            System.out.println("say something");
        }

        Human aChild = new Human();
        aChild.age = 12;
        System.out.println(aChild.getStageOfLife());

        Human anAdult = new Human();
        anAdult.age = 19;
        System.out.println(anAdult.getStageOfLife());

    }

}
