package com.coderscampus.lesson1;

import java.util.Random;

public class SomeTask implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<10000000; i++) {
            Integer int1 = new Random().nextInt();
            Integer int2 = new Random().nextInt();
            Double something = (int1 + int2) * 1.5;
        }
        System.out.println("Hey look at me, i'm a task! " +
                "I'm running on thread: " + Thread.currentThread().getName());

    }
}