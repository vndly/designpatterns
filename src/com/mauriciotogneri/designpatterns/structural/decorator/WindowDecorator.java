package com.mauriciotogneri.designpatterns.structural.decorator;

public abstract class WindowDecorator implements Window
{
    private final Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated)
    {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void draw()
    {
        this.windowToBeDecorated.draw();
    }

    @Override
    public String getDescription()
    {
        return this.windowToBeDecorated.getDescription();
    }
}