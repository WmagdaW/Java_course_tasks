package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {
    @Test
    void testProbablyIWillThrowExceptionWithoutException() {
        // given
        SecondChallenge challenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.5, 3.0));
        assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.0, 1.0));
    }
    @Test
    void testProbablyIWillThrowExceptionWithException() {
        // given
        SecondChallenge challenge = new SecondChallenge();
        // when & then

                assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2.0, 1.0));
                assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1.0, 1.5));



}
}