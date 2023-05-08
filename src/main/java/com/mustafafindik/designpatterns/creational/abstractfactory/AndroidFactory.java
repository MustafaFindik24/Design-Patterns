package com.mustafafindik.designpatterns.creational.abstractfactory;

public class AndroidFactory implements GUIFactory{
    @Override
    public Button createPressButton() {
        return new AndroidPressButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }
}
