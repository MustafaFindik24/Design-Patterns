package com.mustafafindik.designpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Radiator {
    public void on(){
        System.out.println("Radiator switched on...");
    }
    public void off(){
        System.out.println("Radiator switched on...");
    }
    public void setSpeed(Integer speed){
        System.out.println("Setting radiator speed to " + speed);
    }
}
