package com.mustafafindik.designpatterns.creational.factory;

public class Archer implements Character{
    @Override
    public void move() {
        System.out.println("Archer moving... ");
    }

    @Override
    public void attack() {
        System.out.println("Archer attacking.");
    }
}
