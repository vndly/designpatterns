package com.mauriciotogneri.designpatterns.behavioral.chainofresponsibility;

public class EmailLogger extends Logger
{
    public EmailLogger(int mask)
    {
        super(mask);
    }

    @Override
    protected void writeMessage(String message)
    {
        System.out.println("Sending via email: " + message);
    }
}