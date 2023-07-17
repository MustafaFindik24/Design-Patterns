package com.mustafafindik.designpatterns.behavioral.memento;

public class Memento {
    private String ownerName;
    private double balance;

    public Memento(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}
