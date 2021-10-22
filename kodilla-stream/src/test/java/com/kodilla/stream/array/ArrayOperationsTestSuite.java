package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int [5];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        numbers [3] = 4;
        numbers [4] = 5;

        //When
        double averageResult = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(3.0,averageResult);

    }
}
