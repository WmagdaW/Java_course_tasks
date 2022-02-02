package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
       System.out.println("Buy " + quantity + " " + whatToBuy);
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
