package behavioral.chainofresponsibility;

public class StderrLogger extends Logger
{
	public StderrLogger(int mask)
	{
		super(mask);
	}
	
	@Override
	protected void writeMessage(String message)
	{
		System.err.println("Sending to stderr: " + message);
	}
}