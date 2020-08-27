package com.codecool.geometry.shapes;

public class Circle extends Shape {
    private int radius;
    private final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return (pi * (Math.pow(radius, 2)));
    }

    @Override
    public int calculatePerimeter() {

        return (int) (2 * pi * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle has radius=%d", radius);

    }

}
