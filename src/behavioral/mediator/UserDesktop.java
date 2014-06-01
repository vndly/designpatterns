package behavioral.mediator;

public class UserDesktop extends User
{
	public UserDesktop(Mediator mediator)
	{
		super(mediator);
	}
	
	@Override
	public void receive(String message)
	{
		System.out.println("Received on desktop: " + message);
	}
}