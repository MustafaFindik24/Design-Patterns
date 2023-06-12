package com.mustafafindik.designpatterns.structural.composite.example1;

import lombok.Data;

@Data
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle drawing...");
    }
}
