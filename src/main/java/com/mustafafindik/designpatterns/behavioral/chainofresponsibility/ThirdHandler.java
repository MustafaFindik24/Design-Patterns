package com.mustafafindik.designpatterns.behavioral.chainofresponsibility;

public class ThirdHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel()<=10){
            System.out.println("Third Handler : Request " + request.getLevel());
        } else {
            System.out.println("Request could not be processed.");
        }
    }
}
