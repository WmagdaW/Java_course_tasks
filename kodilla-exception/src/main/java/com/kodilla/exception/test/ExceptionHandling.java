package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();

        try {
            String result = challenge.probablyIWillThrowException(2.0,1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception:"+e);
        } finally {
            System.out.println("Done!");
    }
}
}
