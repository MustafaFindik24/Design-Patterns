package com.mustafafindik.designpatterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Kalın","soslu").addMantar(true).addPeynir("Beyaz").build();
        System.out.println(pizza.toString());
    }
}
