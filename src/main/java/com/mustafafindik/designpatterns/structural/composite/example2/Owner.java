package com.mustafafindik.designpatterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Owner implements Employee{
    private final String name;
    private List<Employee> subordinates;


    public Owner(String name) {
        this.name = name;
        this.subordinates = new ArrayList<>();
    }
    public void addSubordinates(Employee employee){
        subordinates.add(employee);
    }
    @Override
    public void displayInfo() {
        System.out.println("Owner of the company : " + name);
        System.out.println("\nSub Workers of the company owner");
        for (Employee subordinate : subordinates) {
            subordinate.displayInfo();
        }
    }
}

