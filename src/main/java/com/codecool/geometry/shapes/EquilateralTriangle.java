package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    private int side;


    public EquilateralTriangle(int side) {
        super(side,side,side);
        this.side=side;
    }

        @Override
    public String toString() {
        return String.format("Equilateral with: Side=%d",
                side);

    }
}
