package com.mustafafindik.designpatterns.structural.facade.carsystem;

public class App {
    public static void main(String[] args) throws InterruptedException {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        Thread.sleep(3000L);
        System.out.println("*********************************");
        carEngineFacade.stopEngine();
        }
}
