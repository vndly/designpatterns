package com.mauriciotogneri.designpatterns.structural.composite;

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing rectangle...");
    }
}