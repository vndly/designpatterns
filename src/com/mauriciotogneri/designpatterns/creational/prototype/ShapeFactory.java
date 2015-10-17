package com.mauriciotogneri.designpatterns.creational.prototype;

import com.mauriciotogneri.designpatterns.creational.prototype.Shape.Type;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory
{
    private static Map<Type, Shape> prototypes = new HashMap<Type, Shape>();

    static
    {
        ShapeFactory.prototypes.put(Type.CIRCLE, new Circle());
        ShapeFactory.prototypes.put(Type.TRIANGLE, new Triangle());
        ShapeFactory.prototypes.put(Type.RECTANGLE, new Rectangle());
    }

    public static Shape getInstance(Type type) throws CloneNotSupportedException
    {
        Shape shape = ShapeFactory.prototypes.get(type);

        return shape.clone();
    }
}