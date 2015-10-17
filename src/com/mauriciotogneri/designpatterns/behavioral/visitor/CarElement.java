package com.mauriciotogneri.designpatterns.behavioral.visitor;

public interface CarElement
{
    void accept(CarElementVisitor visitor);
}