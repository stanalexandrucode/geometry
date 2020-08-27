package com.codecool.geometry.shapes;

public class Triangle extends Shape {
    private int base, lSide, rSide;
    private double area;

    public Triangle(int base, int lSide, int rSide) {
        this.base = base;
        this.lSide = lSide;
        this.rSide = rSide;
    }

    @Override
    public double calculateArea() {
        double s = (base + lSide + rSide)/2;
        area = Math.sqrt(s*(s - base)*(s - lSide)*(s - rSide));
        return area;
    }

    @Override
    public int calculatePerimeter() {
        return base + lSide + rSide;
    }


    @Override
    public String toString() {
        return String.format("Triangle with: Base=%d,Left side=%d,Right side=%d", base, lSide, rSide);

    }


}