package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Switch
{
	private final List<Command> history = new ArrayList<Command>();
	
	public void storeAndExecute(Command command)
	{
		this.history.add(command);
		command.execute();
	}
}