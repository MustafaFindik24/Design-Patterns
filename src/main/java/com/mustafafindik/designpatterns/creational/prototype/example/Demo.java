package com.mustafafindik.designpatterns.creational.prototype.example;

public class Demo {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Prototype-1");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();
        clonedPrototype.setName("Prototype-2");

        System.out.println(prototype.getName());
        System.out.println(clonedPrototype.getName());

        System.out.print("More than one object holds a different memories as you can see : " + prototype.hashCode() + " \\ ");
        System.out.println(clonedPrototype.hashCode());
    }
}
