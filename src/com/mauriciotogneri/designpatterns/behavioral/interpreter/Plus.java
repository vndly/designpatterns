package com.mauriciotogneri.designpatterns.behavioral.interpreter;

public class Plus implements Expression
{
	private final Expression leftOperand;
	private final Expression rightOperand;
	
	public Plus(Expression leftOperand, Expression rightOperand)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	
	@Override
	public int interpret(Context context)
	{
		return this.leftOperand.interpret(context) + this.rightOperand.interpret(context);
	}
}