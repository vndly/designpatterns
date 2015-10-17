package com.mauriciotogneri.designpatterns.structural.composite;

public class Main
{
    public static void main(String[] args)
    {
        CompositeShape shape1 = new CompositeShape();
        CompositeShape shape2 = new CompositeShape();
        CompositeShape shape3 = new CompositeShape();

        shape2.add(new Circle());
        shape2.add(new Triangle());
        shape2.add(new Rectangle());

        shape3.add(new Circle());

        shape1.add(shape2);
        shape1.add(shape3);

        shape1.draw();
    }
}