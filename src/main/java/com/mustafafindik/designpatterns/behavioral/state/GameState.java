package com.mustafafindik.designpatterns.behavioral.state;

public class GameState {
    private Console console;

    public GameState(){
        System.out.println("Game begun.");
        console = new Attack();
    }

    public void triangle(){
        console.pressTriangle();
    }
    public void square(){
        console.pressSquare();
    }
    public void circle(){
        console.pressCircular();
    }
    public void x(){
        console.pressX();
    }
    public void takeTheBall(){
        System.out.println("Top bize geçti. Hücuma geçiliyor...");
        console = new Attack();

    }
    public void giveTheBall(){
        System.out.println("Top kaptırıldı. Defansa geçiliyor...");
        console = new Defence();
    }
}
