package com.mustafafindik.designpatterns.structural.decorator;

public class Espresso implements Coffee{
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double price() {
        return 35.0;
    }
}
