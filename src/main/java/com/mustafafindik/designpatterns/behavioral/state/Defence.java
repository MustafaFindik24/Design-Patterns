package com.mustafafindik.designpatterns.behavioral.state;

public class Defence implements Console{
    @Override
    public void pressSquare() {
        System.out.println("Müdahale ediliyor...");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Kaleci açılıyor...");
    }

    @Override
    public void pressCircular() {
        System.out.println("Kayarak müdahale gerçekleştiriliyor...");
    }

    @Override
    public void pressX() {
        System.out.println("Rakibe press yapılıyor...");
    }
}
