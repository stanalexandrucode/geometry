package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.utilities.FormulaProvider;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ShapeCollection {
    public List<Shape> shapes= new ArrayList<>();

    public ShapeCollection() {

    }
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public Integer getLargestShapeByPerimeter(){
       List<Integer> list = new ArrayList<>();
        for(Shape p:shapes){
          list.add(p.calculatePerimeter());
        }return Collections.max(list,null);
    }
    public Integer getLargestShapeByArea(){
        List<Integer> areaMax = new ArrayList<>();
        for(Shape p:shapes){
            areaMax.add((int) p.calculateArea());
        }return Collections.max(areaMax,null);
    }
    public StringBuilder getShapesTable(){
        StringBuilder table=new StringBuilder();
        String str=" ";

        int count=0;



        for(Shape p: shapes){
//            String repeted= str.repeat(Integer.valueOf(p.toString().length())-8);
//            System.out.println("ID|"+"toString"+repeted+" | Perimeter"+"| Area");

            table.append(count+" | "+p.toString()+"| "+p.calculatePerimeter()+"| "+ FormulaProvider.getPerimeterForShape(p.toString().split(" ")[0])+"| " +p.calculateArea()+"| "+FormulaProvider.getAreaForShape(p.toString().split(" ")[0])+"\n");
            count++;
        }
        return table;
    }
}
