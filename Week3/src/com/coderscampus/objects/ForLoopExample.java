package com.coderscampus.objects;

public class ForLoopExample {

    void forLoopExample1 () {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ": ");
            System.out.println(i);
        }

        System.out.println("Done!");
    }

    void incrementExample1 () {
        for (int j=0; j<10; j++) {
            System.out.println(j);
        }
        for (int j=9; j>=0; j--) {
            System.out.println(j);
        }
        System.out.println("Done!");
    }

    void incrementExample2 (int j) {
        System.out.println("Inside incrementExample2 method j = " + j);


    }
}
