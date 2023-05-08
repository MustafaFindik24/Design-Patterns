package com.mustafafindik.designpatterns.creational.abstractfactory;

public class AndroidCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Android checkbox created.");
    }
}
