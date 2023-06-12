package com.mustafafindik.designpatterns.structural.facade.carsystem;

public class CoolingController {
    private static final Integer DEFAULT_RADIATOR_SPEED = 10;

    private Integer tempatureUpperLimit;
    private Radiator radiator = new Radiator();
    private TempatureSensor temperatureSensor = new TempatureSensor();

    public void setTempatureUpperLimit(Integer tempatureUpperLimit){
        System.out.println("Setting tempature upper limit : " + tempatureUpperLimit);
        this.tempatureUpperLimit = tempatureUpperLimit;
    }
    public void run(){
        System.out.println("Cooling Controller ready.");
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
    }
    public void cool(Integer maxAllowedTemp) {
        System.out.println(("Scheduled cooling with maximum allowed temperature " + maxAllowedTemp));
        temperatureSensor.getTempature();
        radiator.on();
    }

    public void stop() {
        System.out.println("Stopping Cooling Controller..");
        radiator.off();
    }
}
