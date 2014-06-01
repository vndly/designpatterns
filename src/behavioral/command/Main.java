package behavioral.command;

public class Main
{
	public static void main(String[] args)
	{
		Lamp lamp = new Lamp();
		Command switchOn = new FlipUpCommand(lamp);
		Command switchOff = new FlipDownCommand(lamp);
		
		Switch switcher = new Switch();
		switcher.storeAndExecute(switchOn);
		switcher.storeAndExecute(switchOff);
	}
}