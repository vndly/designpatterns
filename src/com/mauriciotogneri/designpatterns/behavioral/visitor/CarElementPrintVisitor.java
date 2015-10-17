package com.mauriciotogneri.designpatterns.behavioral.visitor;

public class CarElementPrintVisitor implements CarElementVisitor
{
    @Override
    public void visit(Wheel wheel)
    {
        System.out.println("Visiting wheel...");
    }

    @Override
    public void visit(Engine engine)
    {
        System.out.println("Visiting engine...");
    }

    @Override
    public void visit(Body body)
    {
        System.out.println("Visiting body...");
    }

    @Override
    public void visit(Car car)
    {
        System.out.println("Visiting car...");
    }
}