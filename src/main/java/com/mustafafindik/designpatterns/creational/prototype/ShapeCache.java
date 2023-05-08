package com.mustafafindik.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String,Shape> shapeMap = new HashMap<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape)cacheShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.clone(); // Use the clone method to create a copy of the circle object
        shapeMap.put("1", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.clone(); // Use the clone method to create a copy of the rectangle object
        shapeMap.put("2", rectangle);
    }
}
