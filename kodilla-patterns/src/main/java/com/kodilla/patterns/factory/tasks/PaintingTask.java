package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Paint " + whatToPaint + "color");
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
