package com.mauriciotogneri.designpatterns.behavioral.observer;

public class Main
{
    public static void main(String[] args)
    {
        EventSource eventSource = new EventSource();
        ResponseHandler responseHandler = new ResponseHandler();
        eventSource.addObserver(responseHandler);

        Thread thread = new Thread(eventSource);
        thread.start();
    }
}