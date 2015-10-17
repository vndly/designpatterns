package com.mauriciotogneri.designpatterns.structural.frontcontroller;

import com.mauriciotogneri.designpatterns.structural.frontcontroller.Processor.Type;

public class FrontController
{
    private Type processorType;
    private final Dispatcher dispatcher;

    public FrontController(Type processorType)
    {
        this.processorType = processorType;
        this.dispatcher = new Dispatcher();
    }

    public void setProcessorType(Type processorType)
    {
        this.processorType = processorType;
    }

    public void dispatchRequest(String request)
    {
        this.dispatcher.dispatch(this.processorType, request);
    }
}