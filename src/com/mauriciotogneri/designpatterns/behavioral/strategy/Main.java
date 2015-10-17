package com.mauriciotogneri.designpatterns.behavioral.strategy;

public class Main
{
	public static void main(String[] args)
	{
		Context context1 = new Context(new Add());
		int result1 = context1.executeStrategy(3, 4);
		System.out.println("Result 1: " + result1);
		
		Context context2 = new Context(new Subtract());
		int result2 = context2.executeStrategy(3, 4);
		System.out.println("Result 2: " + result2);
		
		Context context3 = new Context(new Multiply());
		int result3 = context3.executeStrategy(3, 4);
		System.out.println("Result 3: " + result3);
	}
}