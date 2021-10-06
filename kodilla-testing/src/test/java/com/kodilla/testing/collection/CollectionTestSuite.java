package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("The beginning of Test Case");
    }

    @AfterEach
    public void after() {
        System.out.println("The end of Test Case");
    }
    @DisplayName("When an empty list is created, " + "then method exterminate() should return an empty list of even numbers."
    )
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer>emptyListResult = exterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(Arrays.asList(), emptyListResult);

    }
    @DisplayName("When a normal list of numbers is created, " + "then method exterminate() should return a list of even numbers only."
    )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> normalListResult = exterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(Arrays.asList(2,4,6), normalListResult);
    }
}
