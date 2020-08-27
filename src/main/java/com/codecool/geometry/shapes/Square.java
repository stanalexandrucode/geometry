package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public String toString() {
        return String.format("Square with: Length=%d,Width=%d", getLength(), getWidth());

    }


}
