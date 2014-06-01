package behavioral.command;

public class FlipDownCommand implements Command
{
	private final Lamp lamp;
	
	public FlipDownCommand(Lamp lamp)
	{
		this.lamp = lamp;
	}
	
	@Override
	public void execute()
	{
		this.lamp.turnOff();
	}
}