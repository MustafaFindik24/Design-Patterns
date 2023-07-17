package com.mustafafindik.designpatterns.behavioral.observer;

import org.springframework.objenesis.ObjenesisSerializer;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String name;

    public User(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NewsPublisher){
            NewsPublisher newsPublisher = (NewsPublisher) o;
            System.out.println(name + " recieved the latest news : " + newsPublisher.getLatestNews());
        }
    }
}
