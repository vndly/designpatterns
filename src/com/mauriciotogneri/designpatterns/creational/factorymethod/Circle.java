package com.mauriciotogneri.designpatterns.creational.factorymethod;

public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing circle...");
    }
}