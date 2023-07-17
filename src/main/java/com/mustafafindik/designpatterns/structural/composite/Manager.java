package com.mustafafindik.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> subordinates;

    public Manager (String name, String position){
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<>();
    }
    public void addSubordinates(Employee employee){
        subordinates.add(employee);
    }
    public void removeSubordinates(Employee employee){
        subordinates.remove(employee);
    }
    @Override
    public void displayInfo() {
        System.out.println("**********************************\n");
        System.out.println("Manager name : " + name + "\nHis position : " + position);
        System.out.println("------------------------\n");
        for (Employee subordinate : subordinates) {
            subordinate.displayInfo();
        }
    }
}
