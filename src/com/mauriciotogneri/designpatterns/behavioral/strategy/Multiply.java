package com.mauriciotogneri.designpatterns.behavioral.strategy;

public class Multiply implements Strategy
{
    @Override
    public int execute(int a, int b)
    {
        return a * b;
    }
}