package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task performTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "apples", 5.0);
            case PAINTING:
                return new PaintingTask ("Painting", "white", "walls");
            case DRIVING:
                return new DrivingTask ("Driving", "the bank", "car");
            default:
                return null;
        }

    }
}
