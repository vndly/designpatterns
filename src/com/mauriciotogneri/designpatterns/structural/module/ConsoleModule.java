package com.mauriciotogneri.designpatterns.structural.module;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleModule
{
	private InputStream input = null;
	private PrintStream output = null;
	private PrintStream error = null;
	private static ConsoleModule instance = null;
	
	private ConsoleModule()
	{
		System.out.println("Initializing console...");
	}
	
	public static synchronized ConsoleModule getInstance()
	{
		if (ConsoleModule.instance == null)
		{
			synchronized (ConsoleModule.class)
			{
				if (ConsoleModule.instance == null)
				{
					ConsoleModule.instance = new ConsoleModule();
				}
			}
		}
		
		return ConsoleModule.instance;
	}
	
	public void prepare()
	{
		this.input = System.in;
		this.output = System.out;
		this.error = System.err;
	}
	
	public void unprepare()
	{
		this.output = null;
		this.input = null;
		this.error = null;
	}
	
	public String readInput()
	{
		String result = "";
		
		printOutput("Enter value: ");
		
		Scanner scanner = new Scanner(this.input);
		result = scanner.nextLine();
		scanner.close();
		
		return result;
	}
	
	public void printOutput(String text)
	{
		this.output.print(text);
	}
	
	public void printError(String text)
	{
		this.error.print(text);
	}
}