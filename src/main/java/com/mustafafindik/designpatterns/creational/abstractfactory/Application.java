package com.mustafafindik.designpatterns.creational.abstractfactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button= factory.createPressButton();
        checkbox=factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
