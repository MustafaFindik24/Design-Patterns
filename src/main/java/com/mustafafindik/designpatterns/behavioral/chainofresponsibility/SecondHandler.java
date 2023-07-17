package com.mustafafindik.designpatterns.behavioral.chainofresponsibility;

public class SecondHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel()<=5){
            System.out.println("Second handler : Request " + request.getLevel());
        } else if (successor != null) {
            System.out.println("Second handler transfering the upper handler...");
            successor.handleRequest(request);
        }
    }
}
