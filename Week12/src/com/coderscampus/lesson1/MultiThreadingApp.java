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

        List<CompletableFuture<Void>> tasks = new ArrayList<>();

        // This is how you get access to the ForkJoinPool's common pool,
        // Which is the default thread pool that's used with the CompletableFutures
        // if you do not specify an executor

        // ExecutorService executor = Executors.newSingleThreadExecutor();

         // ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i=0; i<20; i++) {
            CompletableFuture<Void> task = CompletableFuture.supplyAsync(SomeTask :: new)
            // CompletableFuture.supplyAsync(SomeTask::new, executor)
            // CompletableFuture.supplyAsync(SomeTask::new)
                    .thenApply(SomeTask::call)
                    .thenAccept(System.out::println);

            tasks.add(task);
            // Futures were great prior to java 8, but now we have something better

            // Future<TaskDto> futureTask = service.submit(new SomeTask());

            // System.out.println(futureTask.get());
            // is a blocking task / call to the get method
            // going to stop and wait for the future task/wrapper, for the value
        }

        message = "Done";
        System.out.println(message);

        while (tasks.stream()
                    .filter(CompletableFuture::isDone)
                    .count() < 20) {
            // This just loops and keeps the main thread alive until all threads are done working
        }
    }
}
