package com.mustafafindik.designpatterns.behavioral.observer;

import java.util.Observable;

public class NewsPublisher extends Observable {

    private String latestNews;

    public void setLatestNews(String news){
        this.latestNews = news;
        setChanged();   // specify the change of case
        notifyObservers(); // send notifications to the subscribers
    }

    public String getLatestNews(){
        return latestNews;
    }
}

