package com.mauriciotogneri.designpatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(1, 2, 3, new DrawingApiWindows()));
        shapes.add(new Triangle(3, 4, 11, 4, 7, 8, new DrawingApiLinux()));
        shapes.add(new Rectangle(4, 5, 10, 9, new DrawingApiWindows()));

        for (Shape shape : shapes)
        {
            shape.draw();
        }
    }
}