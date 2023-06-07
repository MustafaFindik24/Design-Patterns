package com.mustafafindik.designpatterns.creational.singleton;

public final class Singleton {
    private static volatile Singleton instance; // değişken thread-safe olarak tanımlanır ve diğer threadler tarafından değiştirilemez
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
        if (instance == null){ // double-checked
            synchronized (Singleton.class){ // synchronized birden fazla threadin aynı anda getInstance() erişmesini önler (thread-safe)
                if(instance == null){
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}
