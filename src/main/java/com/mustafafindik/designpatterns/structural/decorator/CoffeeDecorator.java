package com.mustafafindik.designpatterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee{
    private Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public double price() {
        return coffee.price();
    }
}
