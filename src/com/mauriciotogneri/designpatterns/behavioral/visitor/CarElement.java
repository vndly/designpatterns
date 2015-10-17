package com.mauriciotogneri.designpatterns.behavioral.visitor;

public interface CarElement
{
    public void accept(CarElementVisitor visitor);
}