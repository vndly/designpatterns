package com.mauriciotogneri.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer
{
    @Override
    public void update(Observable source, Object parameter)
    {
        if (parameter instanceof String)
        {
            System.out.println("Received: " + parameter);
        }
    }
}