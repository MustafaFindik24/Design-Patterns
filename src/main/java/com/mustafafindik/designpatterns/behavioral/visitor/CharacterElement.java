package com.mustafafindik.designpatterns.behavioral.visitor;

import com.mustafafindik.designpatterns.creational.factory.Character;

public interface CharacterElement {
    void accept(CharacterVisitor visitor);
}
