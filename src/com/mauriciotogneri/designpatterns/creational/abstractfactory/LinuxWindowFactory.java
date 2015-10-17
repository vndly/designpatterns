package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class LinuxWindowFactory implements AbstractWindowFactory
{
    @Override
    public Window createWindow()
    {
        return new LinuxWindow();
    }
}