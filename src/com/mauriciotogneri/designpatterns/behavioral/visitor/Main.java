package com.mauriciotogneri.designpatterns.behavioral.visitor;

public class Main
{
	public static void main(String[] args)
	{
		CarElement car = new Car();
		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}
}