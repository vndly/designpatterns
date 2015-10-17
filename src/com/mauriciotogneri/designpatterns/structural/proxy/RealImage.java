package com.mauriciotogneri.designpatterns.structural.proxy;

public class RealImage implements Image
{
    private final String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk()
    {
        System.out.println("Loading: " + this.fileName);
    }

    @Override
    public void display()
    {
        System.out.println("Displaying: " + this.fileName);
    }
}