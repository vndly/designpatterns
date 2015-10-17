package com.mauriciotogneri.designpatterns.structural.adapter;

public class LegacyLine
{
    public void draw(int x1, int y1, int x2, int y2)
    {
        System.out.println("Drawing line: (" + x1 + ", " + y1 + ") to (" + x2 + " , " + y2 + ")");
    }
}