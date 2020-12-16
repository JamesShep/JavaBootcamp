package com.coderscampus.week5;

public class Human {

    static int TEENAGER_AGE = 13;
    static int ADULT_AGE = 19;
    static int SENIOR_AGE = 65;
    // instance variable
    private int age;

    // getter, return the value of a private instance variable
    // aka, returns the int value of age

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        if (age < 0 || age > 150) {
            System.out.println("No no no, that's not a valid age. A valid age is " +
                    " between 0 and 130.");
            return;
        }
        this.age = age;
    }

    public String getStageOfLife () {
        if (age < TEENAGER_AGE) {
            return "Child";
        } else if (age < ADULT_AGE) {
            return "Teenage";
        } else if (age < SENIOR_AGE) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}
