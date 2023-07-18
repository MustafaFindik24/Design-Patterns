package com.mustafafindik.designpatterns.behavioral.visitor;

public class Character implements CharacterElement{
    private String name;
    private int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void accept(CharacterVisitor visitor) {
        visitor.visit(this);
    }
}
