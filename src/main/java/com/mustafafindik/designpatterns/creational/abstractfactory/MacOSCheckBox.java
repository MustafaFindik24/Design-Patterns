package com.mustafafindik.designpatterns.creational.abstractfactory;

public class MacOSCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Created MacOS checkbox.");
    }
}
