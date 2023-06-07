package com.mustafafindik.designpatterns.structural.decorator;

public class App {
    public static void main(String[] args) {

        Coffee espresso= new Espresso();
        System.out.println("Espresso : " + espresso.description() + "\nPrice : " + espresso.price());
        System.out.println("----------------------------------");
        Americano americano = new Americano();
        System.out.println("Americano : " + americano.description() + "\nPrice : " + americano.price());
        System.out.println("----------------------------------");

        Coffee espressoWithMilk = new MilkDecorator(new Espresso());
        System.out.println("Espresso with milk : " + espressoWithMilk.description() + "\nPrice : "+ espressoWithMilk.price());
        System.out.println("----------------------------------");
        Coffee americanoWithMilk = new MilkDecorator(new Americano());
        System.out.println("Americano with milk : " + americanoWithMilk.description() + "\nPrice : "+ americanoWithMilk.price());

        Coffee americanoWithSugar = new SugarDecorator(new MilkDecorator(new Americano()));
        System.out.println("Americano with milk and sugar : " + americanoWithSugar.description() + "\nPrice : " + americanoWithSugar.price()); // DAMN IT WORKS!
    }
}