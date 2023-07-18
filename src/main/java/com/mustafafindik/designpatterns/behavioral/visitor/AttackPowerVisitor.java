package com.mustafafindik.designpatterns.behavioral.visitor;

public class AttackPowerVisitor implements CharacterVisitor{
    @Override
    public void visit(Character character) {
        int attackPower = character.getLevel() * 10;
        System.out.println(character.getName() + " your character attack power : " + attackPower);
    }
}
