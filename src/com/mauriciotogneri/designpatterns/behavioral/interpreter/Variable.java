package com.mauriciotogneri.designpatterns.behavioral.interpreter;

public class Variable implements Expression
{
    private final String name;

    public Variable(String name)
    {
        this.name = name;
    }

    @Override
    public int interpret(Context context)
    {
        int result = 0;

        if (context.containsKey(this.name))
        {
            result = context.get(this.name).interpret(context);
        }

        return result;
    }
}