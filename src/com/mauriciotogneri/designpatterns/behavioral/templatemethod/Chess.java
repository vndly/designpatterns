package com.mauriciotogneri.designpatterns.behavioral.templatemethod;

public class Chess extends Game
{
	private int turn = 0;
	
	@Override
	protected void initialize()
	{
		System.out.println("Initializing chess...");
	}
	
	@Override
	protected void playTurn()
	{
		System.out.println("Playing turn...");
		
		this.turn++;
	}
	
	@Override
	protected boolean endOfGame()
	{
		return (this.turn == 3);
	}
	
	@Override
	protected void printWinner()
	{
		System.out.println("Game finished...");
	}
}