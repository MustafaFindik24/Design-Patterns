package com.mustafafindik.designpatterns.behavioral.command;

public class BuyCommand implements Order{
    private Stock stock;

    public BuyCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
