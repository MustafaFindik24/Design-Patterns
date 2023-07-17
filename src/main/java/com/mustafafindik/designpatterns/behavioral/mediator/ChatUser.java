package com.mustafafindik.designpatterns.behavioral.mediator;

public class ChatUser extends User{
    public ChatUser(ChatMediator mediator, String username) {
        super(mediator, username);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(username + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(username + " receives: " + message);
    }
}
