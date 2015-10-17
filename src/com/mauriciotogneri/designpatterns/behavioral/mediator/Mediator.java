package com.mauriciotogneri.designpatterns.behavioral.mediator;

public interface Mediator
{
    void send(String message, User user);
}