package com.mustafafindik.designpatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String description(){
        return super.description() + "Sugar ";
    }

    @Override
    public double price() {
        return super.price() + 5.0;
    }

}
