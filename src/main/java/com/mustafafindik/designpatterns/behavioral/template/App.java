package com.mustafafindik.designpatterns.behavioral.template;

public class App {
    public static void main(String[] args) {
        HouseTemplate template = new WoodenHouse();
        template.buildHouse();
        System.out.println("------------------");

        template = new GlassHouse();
        template.buildHouse();
    }
}
