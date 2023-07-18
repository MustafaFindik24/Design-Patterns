package com.mustafafindik.designpatterns.behavioral.strategy;

public class BankTransfer implements PaymentStrategy{
    private String accountNumber;
    private String bankCode;

    public BankTransfer(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " TRY, paid by bank transfer. ");
    }
}
