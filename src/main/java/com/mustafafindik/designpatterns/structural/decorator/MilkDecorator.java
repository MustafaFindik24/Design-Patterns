package com.mustafafindik.designpatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String description(){
        return super.description() + " Milk ";
    }
    @Override
    public double price() {
        return super.price() + 10.0;
    }
}
