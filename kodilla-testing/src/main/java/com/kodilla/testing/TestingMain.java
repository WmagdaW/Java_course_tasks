package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);

        System.out.println("Test - pierwszy test jednostkowy:");

        int result = calculator.add(10, 5);

        if (result == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - drugi test jednostkowy:");

        int result2 = calculator.subtract(10, 5);

        if (result2 == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}


