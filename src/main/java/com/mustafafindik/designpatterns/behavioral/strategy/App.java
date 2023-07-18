package com.mustafafindik.designpatterns.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();

        PaymentStrategy creditCard = new CreditCard("3333 4444 5555 6666", "10-2023", "443");
        PaymentStrategy bankTransfer = new BankTransfer("TR12 3456 7890 1234 5678 9012", "DFDSGJ943");
        PaymentStrategy payPal = new PayPal("mustafa.findik@gmail.com","password");

        customer.setPaymentStrategy(creditCard);
        creditCard.pay(3000.0);

        customer.setPaymentStrategy(bankTransfer);
        bankTransfer.pay(5500.0);

        customer.setPaymentStrategy(payPal);
        payPal.pay(10000.0);
    }
}
