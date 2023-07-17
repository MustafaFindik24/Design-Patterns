package com.mustafafindik.designpatterns.behavioral.chainofresponsibility;

public class FirstHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel()<=3){
            System.out.println("First handler : Request " + request.getLevel());
        }else if (successor!=null){
            System.out.println("First handler transfering the upper handler...");
            successor.handleRequest(request);
        }
    }
}
