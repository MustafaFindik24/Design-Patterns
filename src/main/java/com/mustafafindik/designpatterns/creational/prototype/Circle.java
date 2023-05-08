package com.mustafafindik.designpatterns.creational.prototype;

public class Circle implements Shape{
    private String type;

    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    @Override
    public Shape clone() {
        Shape clonedShape = null;
        try {
            clonedShape = (Shape) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clonedShape;
    }
}
