package com.mauriciotogneri.designpatterns.creational.factorymethod;

public interface Shape
{
    enum Type
    {
        CIRCLE, TRIANGLE, RECTANGLE
    }

    void draw();
}