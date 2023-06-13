package com.mustafafindik.designpatterns.structural.proxy;

public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.png");
        image.display();
        image.display();
    }
}
