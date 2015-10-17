package com.mauriciotogneri.designpatterns.creational.factorymethod;

import com.mauriciotogneri.designpatterns.creational.factorymethod.Shape.Type;

public class ShapeFactory
{
    public Shape getShape(Type type)
    {
        Shape shape = null;

        switch (type)
        {
            case CIRCLE:
                shape = new Circle();
                break;

            case TRIANGLE:
                shape = new Triangle();
                break;

            case RECTANGLE:
                shape = new Rectangle();
                break;
        }

        return shape;
    }
}