package com.mustafafindik.designpatterns.behavioral.strategy;

public class PayPal implements PaymentStrategy{
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " TRY, paid by PayPal. ");
    }
}
