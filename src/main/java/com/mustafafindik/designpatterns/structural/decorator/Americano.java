package com.mustafafindik.designpatterns.structural.decorator;

public class Americano implements Coffee{
    @Override
    public String description() {
        return "Americano";
    }

    @Override
    public double price() {
        return 45.0;
    }
}
