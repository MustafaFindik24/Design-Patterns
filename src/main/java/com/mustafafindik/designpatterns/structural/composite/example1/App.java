package com.mustafafindik.designpatterns.structural.composite.example1;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        ShapeGroup shapeGroup = new ShapeGroup();
        shapeGroup.addShape(circle);
        shapeGroup.addShape(square);

        shapeGroup.draw();
    }
}
