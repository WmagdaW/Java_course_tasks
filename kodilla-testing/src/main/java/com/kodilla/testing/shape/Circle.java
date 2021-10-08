package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String name;
    private double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    public String getShapeName() {
        return name;
    }
    public double getField() {
        return r*r*3.14;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "shape='" + name + '\'' +
                ", field=" + getField() + "cm2" +
                '}';
    }
}
