package com.codecool.geometry.shapes;

public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {

        return length * width;
    }

    @Override
    public int calculatePerimeter() {

        return 2*(length + width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with: Length=%d,Width=%d", length, width);

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
