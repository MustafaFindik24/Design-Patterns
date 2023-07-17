package com.mustafafindik.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.addElement(1);
        collection.addElement(2);
        collection.addElement(3);

        Iterator<Integer> iterator = collection.iterator();

        while (iterator.hasNext()){
            int element = iterator.next();
            System.out.println("Element : " + element);
        }

        iterator= collection.iterator();
        while (iterator.hasNext()){
            int element = iterator.next();
            if (element == 1){
                iterator.remove();
            }
        }

        iterator = collection.iterator();
        while (iterator.hasNext()){
            int element = iterator.next();
            System.out.println("Element : " + element);
        }
    }
}
