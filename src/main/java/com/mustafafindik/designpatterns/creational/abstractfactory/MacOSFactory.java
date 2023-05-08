package com.mustafafindik.designpatterns.creational.abstractfactory;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createPressButton() {
        return new MacOSPressButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckBox();
    }
}
