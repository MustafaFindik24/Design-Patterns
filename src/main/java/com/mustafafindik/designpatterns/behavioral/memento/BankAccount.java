package com.mustafafindik.designpatterns.behavioral.memento;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " Tl yatırıldı. Yeni bakiyeniz : " + balance);
    }

    public void withdraw(double amount){
        if (balance>=amount){
            balance -= amount;
            System.out.println(amount + "Tl çekildi. Yeni bakiyeniz : " + balance);
        }else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public Memento save(){
        return new Memento(ownerName, balance);
    }

    public void restore(Memento memento){
    ownerName = memento.getOwnerName();
    balance = memento.getBalance();
        System.out.println("Para geri yüklendi. Yeni bakiyeniz : "+ balance + " Tl");
    }

    @Override
    public String toString() {
        return "Hesap sahibi : " + ownerName + ", Bakiye : " + balance + " Tl";
    }
}
