package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class MacWindowFactory implements AbstractWindowFactory
{
    @Override
    public Window createWindow()
    {
        return new MacWindow();
    }
}