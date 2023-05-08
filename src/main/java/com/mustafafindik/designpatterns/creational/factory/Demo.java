package com.mustafafindik.designpatterns.creational.factory;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose character : ");
        String s = scanner.nextLine();
        Character character = CharacterFactory.createCharacter(s);
        character.move();
        character.attack();
    }
}
