package com.mustafafindik.designpatterns.behavioral.observer;

public class App {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        User user1 = new User("Mustafa");
        User user2 = new User("Melih");
        User user3 = new User("Şeyda");

        newsPublisher.addObserver(user1);
        newsPublisher.addObserver(user2);
        newsPublisher.addObserver(user3);

        newsPublisher.setLatestNews("New article published !");
    }
}
