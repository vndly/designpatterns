package behavioral.chainofresponsibility;

public class StdoutLogger extends Logger
{
	public StdoutLogger(int mask)
	{
		super(mask);
	}
	
	@Override
	protected void writeMessage(String message)
	{
		System.out.println("Writing to stdout: " + message);
	}
}