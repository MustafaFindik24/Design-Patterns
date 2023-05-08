package com.mustafafindik.designpatterns.creational.abstractfactory;

public interface GUIFactory {
    Button createPressButton();
    Checkbox createCheckbox();
}
