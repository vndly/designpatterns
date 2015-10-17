package com.mauriciotogneri.designpatterns.behavioral.interpreter;

public interface Expression
{
    int interpret(Context variables);
}