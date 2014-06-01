package structural.module;

public class Main
{
	public static void main(String[] args)
	{
		ConsoleModule console = ConsoleModule.getInstance();
		
		console.prepare();
		
		String text = console.readInput();
		
		if (text.isEmpty())
		{
			console.printError("Empty value!");
		}
		else
		{
			console.printOutput("Value: " + text);
		}
		
		console.unprepare();
	}
}