package com.mustafafindik.designpatterns.creational.singleton;

public final class Singleton {
    private static volatile Singleton instance; // field defines as thread-safe and cannot change from the other threads
    public String value;

    private Singleton(String value){
        try {
            Thread.sleep(1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }
    public static Singleton getInstance(String value){
        Singleton result = instance;
        if (result != null){
            return result;
        }
        if (instance == null){ // we used double-checked to avoid slowdown
            synchronized (Singleton.class){ // synchronized avoids more than one thread from reaching getInstance() at the same time (thread-safe)
                if(instance == null){
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}
