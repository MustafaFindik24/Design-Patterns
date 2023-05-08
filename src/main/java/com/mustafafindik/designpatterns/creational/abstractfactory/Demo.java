package com.mustafafindik.designpatterns.creational.abstractfactory;

import java.util.Scanner;

public class Demo {
    public static Application configureApplication(){
        Application app;
        GUIFactory factory = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir işletim sistemi adı giriniz : ");
        String osName = scanner.nextLine();

        if (osName.equalsIgnoreCase("mac")){
            factory = new MacOSFactory();
        }else if(osName.equalsIgnoreCase("windows")){
            factory = new WindowsFactory();
        }else if(osName.equalsIgnoreCase("android")){
            factory = new AndroidFactory();
        }else {
            System.out.println("Bu işletim sistemi sistemde yüklü değildir.");
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
