package com.coderscampus.lesson1;

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

        // ExecutorService service = Executors.newSingleThreadExecutor();

        for (int i=0; i<20; i++) {
            CompletableFuture.supplyAsync(SomeTask::new)
                    .thenApply(SomeTask::call)
                    .thenAccept(System.out::println);



            // Futures were great prior to java 8, but now we have something better

            // Future<TaskDto> futureTask = service.submit(new SomeTask());

            // System.out.println(futureTask.get());
            // is a blocking task / call to the get method
            // going to stop and wait for the future task/wrapper, for the value
        }

        message = "Done";
        System.out.println(message);
    }
}
