package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.performTask(TaskFactory.SHOPPING);
        int n = 2;
        double quantity = 5.0;
        String whatToBuy = "apples";
        //Then
        assert shopping != null;
        assertEquals("Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
        assertEquals("Buy " + quantity + " " + whatToBuy, "Buy 5.0 apples");
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.performTask(TaskFactory.PAINTING);
        //Then
        assert painting != null;
        assertEquals("Painting", painting.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.performTask(TaskFactory.DRIVING);
        //Then
        assert driving != null;
        assertEquals("Driving", driving.getTaskName());
    }
}
