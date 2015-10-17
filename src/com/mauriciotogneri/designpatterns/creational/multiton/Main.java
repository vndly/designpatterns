package com.mauriciotogneri.designpatterns.creational.multiton;

import com.mauriciotogneri.designpatterns.creational.multiton.Shape.Type;

public class Main
{
    public static void main(String[] args)
    {
        Shape shape1 = Shape.getShape(Type.CIRCLE);
        shape1.draw();

        Shape shape2 = Shape.getShape(Type.TRIANGLE);
        shape2.draw();

        Shape shape3 = Shape.getShape(Type.RECTANGLE);
        shape3.draw();
    }
}