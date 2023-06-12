package com.mustafafindik.designpatterns.structural.composite.example2;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Worker("Mustafa", "Worker");
        Employee emp2 = new Worker("Alper", "Worker");
        Employee emp3 = new Worker("Fatma", "Worker");
        Employee emp4 = new Worker("Merve", "Worker");

        Manager mng1 = new Manager("Melih", "Manager");
        Manager mng2 = new Manager("Sinan", "Manager");

        mng1.addSubordinates(emp1);
        mng1.addSubordinates(emp2);

        mng2.addSubordinates(emp3);
        mng2.addSubordinates(emp4);
        Owner owner = new Owner("Osman");
        owner.addSubordinates(mng1);
        owner.addSubordinates(mng2);
        owner.displayInfo();
    }
}
