package com.mauriciotogneri.designpatterns.creational.prototype;

public class Rectangle implements Shape
{
    @Override
    public Rectangle clone() throws CloneNotSupportedException
    {
        return (Rectangle) super.clone();
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing rectangle...");
    }
}