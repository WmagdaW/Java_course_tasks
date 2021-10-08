package com.kodilla.testing.shape;

public class Square implements Shape{

    private String name;
    private double a;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public String getShapeName() {
        return name;
    }
    public double getField() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shape='" + name + '\'' +
                ", field=" + getField() + "cm2" +
                '}';
    }
}
