package com.mustafafindik.designpatterns.creational.factory;

public class CharacterFactory {
    public static Character createCharacter(String type){
        if (type.equalsIgnoreCase("Mage")){
            return new Mage();
        } else if (type.equalsIgnoreCase("Warrior")) {
            return new Warrior();
        } else if (type.equalsIgnoreCase("Archer")) {
            return new Archer();
        } else {
            throw new IllegalArgumentException("Unknown character type.");
        }
    }
}
