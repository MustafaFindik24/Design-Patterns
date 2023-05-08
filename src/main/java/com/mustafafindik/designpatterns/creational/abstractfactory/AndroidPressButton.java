package com.mustafafindik.designpatterns.creational.abstractfactory;

public class AndroidPressButton implements Button{
    @Override
    public void paint() {
        System.out.println("Android press button created.");
    }
}
