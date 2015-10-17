package com.mauriciotogneri.designpatterns.structural.frontcontroller;

import com.mauriciotogneri.designpatterns.structural.frontcontroller.Processor.Type;

public class Main
{
    public static void main(String[] args)
    {
        FrontController frontController = new FrontController(Type.LOCAL);
        frontController.dispatchRequest("Request 1");

        frontController.setProcessorType(Type.REMOTE);
        frontController.dispatchRequest("Request 2");
        frontController.dispatchRequest("Request 3");
    }
}