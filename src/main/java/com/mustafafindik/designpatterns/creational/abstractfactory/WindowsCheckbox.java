package com.mustafafindik.designpatterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Created Windows checkbox.");
    }
}
