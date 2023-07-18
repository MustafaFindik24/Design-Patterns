package com.mustafafindik.designpatterns.behavioral.visitor;

public class App {
    public static void main(String[] args) {
        Character character = new Character("Warrior", 13);

        CharacterVisitor levelVisitor = new LevelStatisticsVisitor();
        CharacterVisitor attackVisitor = new AttackPowerVisitor();

        character.accept(levelVisitor);
        character.accept(attackVisitor);
    }
}
