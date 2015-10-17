package com.mauriciotogneri.designpatterns.structural.facade;

public class HardDrive
{
    public byte[] read(long position, int size)
    {
        System.out.println("Reading data from position: " + position);

        return new byte[0];
    }
}