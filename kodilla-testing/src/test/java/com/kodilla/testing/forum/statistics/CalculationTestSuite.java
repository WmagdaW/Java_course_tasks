package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculationTestSuite {
    @Mock
    private Statistics statisticsMock;
    private Calculation calculation;
    @BeforeEach
    public void init() {
       calculation = new Calculation(statisticsMock);
    }
    @Test
    void testCalculateAdvStatistics0Posts() {
        //Given

        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculation.getPostQuantity());
        assertEquals(0, calculation.getPostAveragePerUser());
        assertEquals(0, calculation.getCommentAveragePerPost());
    }
    private List<String> generateUserList (int userQuantity) {
        List<String> userList = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            userList.add("User name");
        }
        return userList;
    }

    @Test
    void testCalculateAdvStatistics1000Posts() {

        //Given

        when(statisticsMock.postsCount()).thenReturn(1000);
        List <String> listOfUsers = generateUserList(10);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculation.getPostQuantity());
        assertEquals(100, calculation.getPostAveragePerUser());
        assertEquals(2, calculation.getCommentAveragePerPost());
    }
    @Test
    void testCalculateAdvStatistics0Comments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        Calculation calculation = new Calculation(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(200);
        List <String> listOfUsers = generateUserList(10);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculation.getCommentQuantity());
        assertEquals(0, calculation.getCommentAveragePerUser());
        assertEquals(0, calculation.getCommentAveragePerPost());
    }
    @Test
    void testCalculateAdvStatisticsCommentsQuantitySmallerThenPostQuantity() {
        //Given
        Statistics statistics = mock(Statistics.class);
        Calculation calculation = new Calculation(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(1000);
        List <String> listOfUsers = generateUserList(10);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(200, calculation.getCommentQuantity());
        assertEquals(1000, calculation.getPostQuantity());
        assertEquals(100, calculation.getPostAveragePerUser());
        assertEquals(20, calculation.getCommentAveragePerUser());
        assertEquals(0.2, calculation.getCommentAveragePerPost());
    }
    @Test
    void testCalculateAdvStatisticsCommentsQuantityBiggerThenPostQuantity() {
        Statistics statistics = mock(Statistics.class);
        Calculation calculation = new Calculation(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(200);
        List <String> listOfUsers = generateUserList(10);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculation.getCommentQuantity());
        assertEquals(200, calculation.getPostQuantity());
        assertEquals(20, calculation.getPostAveragePerUser());
        assertEquals(100, calculation.getCommentAveragePerUser());
        assertEquals(5, calculation.getCommentAveragePerPost());
    }
    @Test
    void testCalculateAdvStatistics0Users() {
        Statistics statistics = mock(Statistics.class);
        Calculation calculation = new Calculation(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(200);
        List<String> listOfUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculation.getUserQuantity());
        assertEquals(0, calculation.getPostAveragePerUser());
        assertEquals(0, calculation.getCommentAveragePerUser());
    }
    @Test
    void testCalculateAdvStatistics100Users() {
        Statistics statistics = mock(Statistics.class);
        Calculation calculation = new Calculation(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(200);
        List<String> listOfUsers = new ArrayList<>();
        for (int n = 0; n <100; n++) {
            listOfUsers.add("User name");
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        //When
        calculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, calculation.getUserQuantity());
        assertEquals(2, calculation.getPostAveragePerUser());
        assertEquals(10, calculation.getCommentAveragePerUser());
    }
    }

