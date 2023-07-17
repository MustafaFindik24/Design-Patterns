package com.mustafafindik.designpatterns.behavioral.state;

public class App {
    public static void main(String[] args) {
        GameState gameState = new GameState();
        gameState.x();
        gameState.circle();
        gameState.triangle();
        gameState.giveTheBall();

        gameState.x();
        gameState.circle();
        gameState.triangle();
        gameState.takeTheBall();
    }
}
