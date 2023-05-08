package com.mustafafindik.designpatterns.creational.singleton;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern Example");
        Singleton first = Singleton.getInstance("First");
        Singleton second = Singleton.getInstance("Second");
        System.out.print("We can see these objects holds the same memory because its hashcode are same value : ");
        System.out.print(first.hashCode() + " // ");
        System.out.println(second.hashCode());
        System.out.println(first.value);
        System.out.println(second.value);
        System.out.println(first.equals(second));
    }
}
