package com.mauriciotogneri.designpatterns.structural.composite;

public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing cicle...");
    }
}