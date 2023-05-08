package com.mustafafindik.designpatterns.creational.abstractfactory;

import java.sql.SQLOutput;

public class MacOSPressButton implements Button{
    @Override
    public void paint(){
        System.out.println("MacOS press button created.");
    }
}
