package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class GuiBuilder
{
    public void buildWindow(AbstractWindowFactory windowFactory)
    {
        Window window = windowFactory.createWindow();
        window.display();
    }
}