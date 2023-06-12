package com.mustafafindik.designpatterns.structural.bridge;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("Advanced Remote : Device muted");
        device.setVolume(0);
    }
}
