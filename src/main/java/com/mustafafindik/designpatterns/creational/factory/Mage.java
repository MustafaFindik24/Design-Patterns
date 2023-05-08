package com.mustafafindik.designpatterns.creational.factory;

public class Mage implements Character{
    @Override
    public void move() {
        System.out.println("Mage moving...");
    }

    @Override
    public void attack() {
        System.out.println("Mage attacking.");
    }
}
