package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println ("Go to " + where + " by " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        Random random = new Random();
        int n = random.nextInt(10);
        if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
