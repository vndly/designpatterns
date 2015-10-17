package com.mauriciotogneri.designpatterns.behavioral.chainofresponsibility;

public class Main
{
	public static void main(String[] args)
	{
		Logger logger = new StdoutLogger(Logger.DEBUG);
		
		Logger logger1 = new EmailLogger(Logger.INFO);
		logger.setNext(logger1);
		
		Logger logger2 = new StderrLogger(Logger.ERROR);
		logger1.setNext(logger2);
		
		logger.processMessage("Debug message", Logger.DEBUG);
		
		logger.processMessage("Notice message", Logger.INFO);
		
		logger.processMessage("Error message", Logger.ERROR);
	}
}