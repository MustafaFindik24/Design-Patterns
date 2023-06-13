package com.mustafafindik.designpatterns.structural.flyweight;

public class App {
    private static final String[] colors = {"Red","Green","Blue","Yellow","Gray"};
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(200);
            circle.draw();
            System.out.println("Circle hash code : " + circle.hashCode()); // You can see same colors has same hash code. That means creating only once and the others using
                                                                           // same instance.
        }
    }

    private static int getRandomX() {
        return (int) (Math.random() * 200);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 200);
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
