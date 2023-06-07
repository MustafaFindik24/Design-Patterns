package com.mustafafindik.designpatterns.creational.singleton;

public class MultipleThread {
    public static void main(String[] args) {
        Thread threadFirst = new Thread(new ThreadFirst());
        Thread threadSecond = new Thread(new ThreadSecond());
        threadSecond.start();
        threadFirst.start();
    }

    static class ThreadFirst implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("First");
            System.out.println(singleton.value);
        }
    }
    static class ThreadSecond implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Second");
            System.out.println(singleton.value);
        }
    }
}