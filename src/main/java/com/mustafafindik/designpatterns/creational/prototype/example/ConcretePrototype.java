package com.mustafafindik.designpatterns.creational.prototype.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConcretePrototype implements Prototype{
    private String name;
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);    // each call creates a new object and its allocates the memory
    }
}
