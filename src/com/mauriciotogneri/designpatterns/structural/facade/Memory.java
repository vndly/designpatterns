package com.mauriciotogneri.designpatterns.structural.facade;

public class Memory
{
    public void load(long position, byte[] data)
    {
        System.out.println("Loading data in position: " + position + " with length: " + data.length);
    }
}