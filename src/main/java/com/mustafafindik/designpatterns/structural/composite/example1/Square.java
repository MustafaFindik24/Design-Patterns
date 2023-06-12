package com.mustafafindik.designpatterns.structural.composite.example1;

import lombok.Data;

@Data
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square drawing...");
    }

}
