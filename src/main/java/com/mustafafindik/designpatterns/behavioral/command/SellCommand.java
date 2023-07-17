package com.mustafafindik.designpatterns.behavioral.command;

public class SellCommand implements Order{
    private Stock stock;

    public SellCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
