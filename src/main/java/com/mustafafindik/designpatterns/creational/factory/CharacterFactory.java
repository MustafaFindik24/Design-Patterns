package com.mustafafindik.designpatterns.creational.factory;

public class CharacterFactory {
    public static Character createCharacter(String type){
        if (type.equals("Mage")){
            return new Mage();
        } else if (type.equals("Warrior")) {
            return new Warrior();
        } else if (type.equals("Archer")) {
            return new Archer();
        } else {
            throw new IllegalArgumentException("Unknown character type.");
        }
    }
}
