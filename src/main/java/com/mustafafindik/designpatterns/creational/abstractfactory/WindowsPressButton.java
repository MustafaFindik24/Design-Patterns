package com.mustafafindik.designpatterns.creational.abstractfactory;

public class WindowsPressButton implements Button{
    @Override
    public void paint(){
        System.out.println("Windows press button created.");
    }
}
