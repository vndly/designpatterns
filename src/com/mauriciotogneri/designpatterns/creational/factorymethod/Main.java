package com.mauriciotogneri.designpatterns.creational.factorymethod;

import com.mauriciotogneri.designpatterns.creational.factorymethod.Shape.Type;

public class Main
{
	public static void main(String[] args)
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape(Type.CIRCLE);
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(Type.TRIANGLE);
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(Type.RECTANGLE);
		shape3.draw();
	}
}