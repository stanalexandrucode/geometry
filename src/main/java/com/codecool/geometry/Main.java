package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;
import com.codecool.geometry.utilities.FormulaProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      ShapeCollection listShapes= new ShapeCollection();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

	    while (isRunning) {
            System.out.print("Insert a number 0-5: ");
            int option=scanner.nextInt();
               scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Insert name shape: ");
                    String nameShape=scanner.nextLine();
                    if(nameShape.equalsIgnoreCase("Circle")) {
                      System.out.print("Insert int radius: ");
                      int radius = scanner.nextInt();
                      scanner.nextLine();
                      listShapes.addShape(new Circle(radius));
//                      System.out.println(FormulaProvider.getPerimeterForShape(nameShape.substring(0,1).toUpperCase()+nameShape.substring(1).toLowerCase()));
                  }
                    else if(nameShape.equalsIgnoreCase("EquilateralTriangle")){
                        System.out.print("Insert int side: ");
                        int side=scanner.nextInt();
                        listShapes.addShape(new EquilateralTriangle(side));
                    }
                    else if(nameShape.equalsIgnoreCase("Rectangle")){
                        System.out.print("Insert int length: ");
                        int length=scanner.nextInt();
                        System.out.print("Insert int width: ");
                        int width=scanner.nextInt();
                        listShapes.addShape(new Rectangle(length,width));
                    }else if(nameShape.equalsIgnoreCase("RegularPentagon")){
                        System.out.print("Insert int side: ");
                        int side=scanner.nextInt();
                        listShapes.addShape(new RegularPentagon(side));
                    }else if(nameShape.equalsIgnoreCase("Square")){
                        System.out.print("Insert int length: ");
                        int length=scanner.nextInt();
                        System.out.print("Insert int width: ");
                        int width=scanner.nextInt();
                        scanner.nextLine();
                        listShapes.addShape(new Square(length,width));
                    }else if(nameShape.equalsIgnoreCase("Triangle")){
                        System.out.print("Insert int base: ");
                        int base=scanner.nextInt();
                        System.out.print("Insert int lSide: ");
                        int lSide=scanner.nextInt();
                        System.out.print("Insert int rSide: ");
                        int rSide=scanner.nextInt();
                        listShapes.addShape(new Triangle(base,lSide,rSide));
                    }else {
                        System.out.println("Insert a valide value");
                    }
                    System.out.println(listShapes.shapes);
                    break;

                case 2:

                    System.out.println(listShapes.getShapesTable());
                    break;
                case 3:
                    ArrayList<List<Integer>> perimeterMax = new ArrayList<>();
                    perimeterMax.add(Collections.singletonList(listShapes.getLargestShapeByPerimeter()));
                    System.out.println("Max val: " +perimeterMax);
                    break;
                case 4:
                    ArrayList<List<Integer>> areaMax = new ArrayList<>();
                    areaMax.add(Collections.singletonList(listShapes.getLargestShapeByArea()));
                    System.out.println("Max val: " +areaMax);
                    break;
                case 5:
                    System.out.print("Insert name shape to find formula: ");
                    String formulaShape=scanner.nextLine();
                    System.out.printf("%s perimeter is:"+FormulaProvider.getPerimeterForShape(formulaShape.toLowerCase())+ ", %s area is:"+FormulaProvider.getAreaForShape(formulaShape.toLowerCase()),formulaShape,formulaShape);
                    System.out.println("   ");
                    break;
                case 0:
                    isRunning=false;
                    System.out.println("Thank you. By,by");
                    break;
            }
        }
    }
}
