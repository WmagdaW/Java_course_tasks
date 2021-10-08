package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double A;
    private double h;

    public Triangle(String name, double A, double h) {
        this.name = name;
        this.A = A;
        this.h = h;
    }

    public String getShapeName() {

        return name;
    }
    public double getField() {

        return 0.5 * A * h;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shape='" + name + '\'' +
                ", field=" + getField() + "cm2" +
                '}';
    }
}

