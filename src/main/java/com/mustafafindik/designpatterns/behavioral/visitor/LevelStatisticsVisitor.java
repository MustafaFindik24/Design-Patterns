package com.mustafafindik.designpatterns.behavioral.visitor;

public class LevelStatisticsVisitor implements CharacterVisitor{
    @Override
    public void visit(Character character) {
        System.out.println(character.getName() + " your character level : " + character.getLevel());
    }
}
