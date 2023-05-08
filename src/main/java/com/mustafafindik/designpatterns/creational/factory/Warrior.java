package com.mustafafindik.designpatterns.creational.factory;

public class Warrior implements Character{
    @Override
    public void move() {
        System.out.println("Warrior moving...");
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacking.");
    }
}
