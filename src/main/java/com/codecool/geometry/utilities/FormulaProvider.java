package com.codecool.geometry.utilities;

import com.codecool.geometry.shapes.Circle;

public class FormulaProvider {

    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getAreaForShape(String shape) {
        switch (shape){
            case "Circle":
                return "π×r×r";

            case "Equilateral":
                return "a×a×sqrt(3)/4";

            case "Rectangle":
                return "a×b";

            case "RegularPentagon":
                return " a×a×sqrt(5×(5+2×sqrt(5))/4";
            case "square":
                return " a×a";

            case "Triangle":
                return " sqrt(s×(s-a)×(s-b)×(s-c)";

        }

        return "area";
    }


    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getPerimeterForShape(String shape) {
        switch (shape){
            case "Circle":
                return " 2×π×r";

            case "Equilateral":
                return "3×a";

            case "Rectangle":
                return "2×a+2×b";

            case "RegularPentagon":
                return " 5×a";

            case "Square":
                return " 4×a";

            case "Triangle":
                return "  a+b+c";
        }
        return "shape doesn't exist";
    }

}
