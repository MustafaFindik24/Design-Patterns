package com.mustafafindik.designpatterns.behavioral.memento;

public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mustafa", 5000.0);
        BankAccountManager manager = new BankAccountManager();

        manager.saveState(account);
        account.deposit(300.0);
        account.withdraw(500.0);

        manager.saveState(account);

        account.withdraw(4000.0);

        manager.restoreState(account);
    }
}

