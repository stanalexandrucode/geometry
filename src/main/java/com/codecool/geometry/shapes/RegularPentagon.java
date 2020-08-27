package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {
    private final int side;

    public RegularPentagon(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {

        return (float) (Math.sqrt(5 * (5 + 2
                * (Math.sqrt(5)))) * side * side) / 4;
    }

    @Override
    public int calculatePerimeter() {

        return 5 * side;
    }


    @Override
    public String toString() {
        return String.format("Regular Pentagon with: Side=%d", side);

    }
}
