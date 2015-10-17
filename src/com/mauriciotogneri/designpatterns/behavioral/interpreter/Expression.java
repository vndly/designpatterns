package com.mauriciotogneri.designpatterns.behavioral.interpreter;

public interface Expression
{
	public int interpret(Context variables);
}