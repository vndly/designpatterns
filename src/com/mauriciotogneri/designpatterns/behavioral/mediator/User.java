package com.mauriciotogneri.designpatterns.behavioral.mediator;

public abstract class User
{
    private final Mediator mediator;

    public User(Mediator mediator)
    {
        this.mediator = mediator;
    }

    public void send(String message)
    {
        this.mediator.send(message, this);
    }

    public abstract void receive(String message);
}