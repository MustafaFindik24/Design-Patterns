package com.mustafafindik.designpatterns.behavioral.mediator;

public class App {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new ChatUser(mediator, "User 1");
        User user2 = new ChatUser(mediator, "User 2");
        User user3 = new ChatUser(mediator, "User 3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello, everyone!");
    }
}
