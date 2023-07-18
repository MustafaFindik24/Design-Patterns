package com.mustafafindik.designpatterns.behavioral.strategy;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " TRY, paid by credit card.");
    }
}
