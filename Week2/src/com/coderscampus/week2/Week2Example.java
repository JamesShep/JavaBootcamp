package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("What is your age: ");
        String age = scanner.nextLine();

        if ((name.equals("James") || name.equals("JD")) && age.equals("26")) {
            System.out.println("Holy cow. It's me!");
        } else {
            System.out.println("Hello: " + name);
        }

        scanner.close();
    }

}