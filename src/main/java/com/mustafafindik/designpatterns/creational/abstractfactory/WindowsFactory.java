package com.mustafafindik.designpatterns.creational.abstractfactory;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createPressButton() {
        return new WindowsPressButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
