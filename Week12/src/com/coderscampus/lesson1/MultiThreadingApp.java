package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadingApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

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

        // This is how you get access to the ForkJoinPool's common pool,
        // Which is the default thread pool that's used with the CompletableFutures
        // if you do not specify an executor

        ExecutorService cpuBoundTask = Executors.newFixedThreadPool(3);
        ExecutorService ioBoundTask = Executors.newCachedThreadPool();


        for (int i = 0; i < 20; i++) {
            CompletableFuture.supplyAsync(SomeTask::new)
                    .thenApplyAsync(SomeTask::doSomeWork, cpuBoundTask)
                    .thenApplyAsync(SomeTask::markComplete, ioBoundTask)
                    .thenAcceptAsync(System.out::println, ioBoundTask);
        }

        message = "Done";
        System.out.println(message);
    }
}
