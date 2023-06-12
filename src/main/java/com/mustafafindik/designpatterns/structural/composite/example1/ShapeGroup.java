package com.mustafafindik.designpatterns.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape{
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }
    @Override
    public void draw() {
        System.out.println("Group of shape drawing...");
    }
}
