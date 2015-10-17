package com.mauriciotogneri.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Line());
        shapes.add(new Rectangle());

        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;

        for (Shape shape : shapes)
        {
            shape.draw(x1, y1, x2, y2);
        }
    }
}