package com.mustafafindik.designpatterns.behavioral.mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String username;

    public User(ChatMediator mediator, String username) {
        this.mediator = mediator;
        this.username = username;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
