package com.coderscampus.lesson1;

import java.util.Random;
import java.util.concurrent.Callable;

public class SomeTask {

    private static int taskId = 0;
    private TaskDto taskDto;

    public SomeTask doSomeWork() {
        taskDto = new TaskDto();
        for (int i = 0; i < 10000000; i++) {
            Integer int1 = new Random().nextInt();
            Integer int2 = new Random().nextInt();
            Double something = (int1 + int2) * 1.5;
            taskDto.setValue(something);
        }
        taskId++;
        System.out.println("Hey look at me, i'm a task-id: " + taskId +
                "! I'm running on thread: " + Thread.currentThread().getName());
        taskDto.setFinished(true);
        return this;
    }

    public TaskDto markComplete () {
        taskDto.setFinished(true);
        return taskDto;
    }
}