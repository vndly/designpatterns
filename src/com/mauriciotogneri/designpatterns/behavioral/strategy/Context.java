package com.mauriciotogneri.designpatterns.behavioral.strategy;

public class Context
{
    private final Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b)
    {
        return this.strategy.execute(a, b);
    }
}