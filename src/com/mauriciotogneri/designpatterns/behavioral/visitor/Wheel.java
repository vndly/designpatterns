package com.mauriciotogneri.designpatterns.behavioral.visitor;

public class Wheel implements CarElement
{
    @Override
    public void accept(CarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}