package com.mustafafindik.designpatterns.behavioral.template;

public abstract class HouseTemplate {

    public final void buildHouse(){ //template method, declare final because subclasses cannot override
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    private void buildWindows(){    //default implementation
        System.out.println("Building glass windows...");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation(){
        System.out.println("Building foundation with cement, iron rods and sand...");
    }
}
