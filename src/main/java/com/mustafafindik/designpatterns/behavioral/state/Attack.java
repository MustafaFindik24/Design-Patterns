package com.mustafafindik.designpatterns.behavioral.state;

public class Attack implements Console{
    @Override
    public void pressSquare() {
        System.out.println("Şut çekiliyor...");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Ara pas veriliyor...");
    }

    @Override
    public void pressCircular() {
        System.out.println("Orta açılıyor...");
    }

    @Override
    public void pressX() {
        System.out.println("Kısa pas veriliyor...");
    }
}
