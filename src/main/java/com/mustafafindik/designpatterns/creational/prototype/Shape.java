package com.mustafafindik.designpatterns.creational.prototype;

public interface Shape extends Cloneable{
    public void draw();
    public Shape clone();
}
