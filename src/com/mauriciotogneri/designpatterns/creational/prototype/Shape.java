package com.mauriciotogneri.designpatterns.creational.prototype;

public interface Shape extends Cloneable
{
    enum Type
    {
        CIRCLE, TRIANGLE, RECTANGLE
    }

    Shape clone() throws CloneNotSupportedException;

    void draw();
}