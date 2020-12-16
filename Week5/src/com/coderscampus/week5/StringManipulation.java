package com.coderscampus.week5;

public class StringManipulation {

    public static void main (String [] args) {

        // For each loop
        for (String arg : args) {
            System.out.println(arg);

            // 1, 2, 3, 4 -> [0] = "1", [1] = "2", [2] = "3", [3] = "4" etc

            String[] numbersArray = arg.split(",");
            for (String number : numbersArray) {
                System.out.println(number);
            }
        }
    }
}