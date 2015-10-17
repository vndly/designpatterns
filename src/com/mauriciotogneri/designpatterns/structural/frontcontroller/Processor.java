package com.mauriciotogneri.designpatterns.structural.frontcontroller;

public interface Processor
{
    enum Type
    {
        LOCAL, REMOTE
    }

    void process(String request);
}