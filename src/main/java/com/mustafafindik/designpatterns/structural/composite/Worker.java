package com.mustafafindik.designpatterns.structural.composite;

public class Worker implements Employee{
    private String name;
    private String position;

    public Worker(String name, String position){
        this.name = name;
        this.position = position;
    }
    @Override
    public void displayInfo() {
        System.out.println("Worker information\n" + "name : " + name + "\nposition : " + position + "\n");
    }
}
