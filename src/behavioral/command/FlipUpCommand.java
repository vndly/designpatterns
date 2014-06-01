package behavioral.command;

public class FlipUpCommand implements Command
{
	private final Lamp lamp;
	
	public FlipUpCommand(Lamp lamp)
	{
		this.lamp = lamp;
	}
	
	@Override
	public void execute()
	{
		this.lamp.turnOn();
	}
}