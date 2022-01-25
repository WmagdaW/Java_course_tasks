package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result1 = calculator.add(12, 10);
        double result2 = calculator.sub(12, 10);
        double result3 = calculator.mul(12, 10);
        double result4 = calculator.div(12, 10);
        
        //Then
       Assertions.assertEquals(22, result1);
       Assertions.assertEquals(2, result2);
       Assertions.assertEquals(120, result3);
       Assertions.assertEquals(1.2, result4);
    }
}
