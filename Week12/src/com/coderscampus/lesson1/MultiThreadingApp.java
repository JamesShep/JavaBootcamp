package com.coderscampus.lesson1;

public class MultiThreadingApp {

    public static void main(String[] args) {

        String message = "Starting";
        System.out.println(message);
        System.out.println(Thread.currentThread().getName());

        for (int i=0; i<5; i++) {
            SomeTask task = new SomeTask();
            new Thread(task).start();
        }

        message = "Done";
        System.out.println(message);
    }
}
