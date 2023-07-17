package com.mustafafindik.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String message, User sender) {
        for (User user :
                users) {
            if (user != sender){
                user.receiveMessage(message);
            }
        }
    }
    @Override
    public void addUser(User user) {
        users.add(user);
    }

}
