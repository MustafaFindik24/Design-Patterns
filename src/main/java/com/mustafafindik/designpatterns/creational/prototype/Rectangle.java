package com.mustafafindik.designpatterns.creational.prototype;

public class Rectangle implements Shape{
    private final String type;
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public Shape clone() {
        Shape clonedShape = null;
        try {
            clonedShape=(Shape) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clonedShape;
    }

}
