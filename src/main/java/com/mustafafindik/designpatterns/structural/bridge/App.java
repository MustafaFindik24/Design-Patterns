package com.mustafafindik.designpatterns.structural.bridge;

public class App {
    public static void main(String[] args) throws InterruptedException {
        testDevice(new Television());
        testDevice(new Radio());
        testDevice(new MusicPlayer());
    }

    private static void testDevice(Device device) throws InterruptedException {
        System.out.println("Device testing with basic remote feature...");
        Thread.sleep(3000L);
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Advanced remote testing...");
        Thread.sleep(3000L);
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
        System.out.println("*****************************************");
    }
}
