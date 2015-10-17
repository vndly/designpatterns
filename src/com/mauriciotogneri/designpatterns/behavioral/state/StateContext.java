package com.mauriciotogneri.designpatterns.behavioral.state;

public class StateContext
{
	private Statelike state;
	
	public StateContext()
	{
		setState(new StateLowerCase());
	}
	
	void setState(Statelike state)
	{
		this.state = state;
	}
	
	public void writeName(String name)
	{
		this.state.writeName(this, name);
	}
}