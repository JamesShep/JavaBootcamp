package com.coderscampus.lesson1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingApp {

    public static void main(String[] args) {

        String message = "Starting";
        System.out.println(message);
        System.out.println(Thread.currentThread().getName());

        // This starts up as many threads as there are iterations in the for loop
        // You only want to fire up a ton of threads, if those threads are going to
        // be waiting a lot.. i.e sending requests over the internet

        /*
        for (int i=0; i<5; i++) {
            SomeTask task = new SomeTask();
            new Thread(task).start();
        }
        */

        // For a CPU bound operation like we have in our "SomeTask" class,
        // we should make use of an ExecutorService

        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i=0; i<50; i++) {
            service.execute(new SomeTask());
        }

        message = "Done";
        System.out.println(message);
    }
}
