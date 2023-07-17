package com.mustafafindik.designpatterns.behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        Handler handler1 = new FirstHandler();
        Handler handler2 = new SecondHandler();
        Handler handler3 = new ThirdHandler();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        Request request1 = new Request(5);
        handler1.handleRequest(request1);
        Request request2 = new Request(8);
        handler1.handleRequest(request2);


    }
}
