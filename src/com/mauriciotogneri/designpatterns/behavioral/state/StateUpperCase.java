package com.mauriciotogneri.designpatterns.behavioral.state;

public class StateUpperCase implements Statelike
{
	@Override
	public void writeName(StateContext context, String name)
	{
		System.out.println(name.toUpperCase());
		context.setState(new StateLowerCase());
	}
}