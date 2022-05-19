package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        // Given
        TaskQueue queue1 = new TaskQueue("Tom Brown");
        TaskQueue queue2 = new TaskQueue("Alex Adams");
        TaskQueue queue3 = new TaskQueue("Victoria Parker");

        Mentor johnSmith = new Mentor("John Smith");
        Mentor sarahJones= new Mentor("Sarah Jones");

        queue1.registerMentor(johnSmith);
        queue2.registerMentor(johnSmith);
        queue3.registerMentor(sarahJones);

        // When
        queue1.sendTask("Task module 1");
        queue1.sendTask("Task module 2");
        queue2.sendTask("Task module 1");
        queue3.sendTask("Task module 1");

        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(1, sarahJones.getUpdateCount());
    }
}


