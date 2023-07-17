package com.mustafafindik.designpatterns.behavioral.command;

public class App {
    public static void main(String[] args) {
        Stock stock1 = new Stock("Beef", 12);
        Stock stock2 = new Stock("Sugar", 2);

        BuyCommand buyCommand1 = new BuyCommand(stock1);
        BuyCommand buyCommand2 = new BuyCommand(stock2);

        SellCommand sellCommand1 = new SellCommand(stock1);
        SellCommand sellCommand2 = new SellCommand(stock2);

        Receiver receiver = new Receiver();
        receiver.takeOrder(buyCommand1);
        receiver.takeOrder(buyCommand2);

        receiver.takeOrder(sellCommand1);
        receiver.takeOrder(sellCommand2);

        receiver.placeOrders();
    }
}
