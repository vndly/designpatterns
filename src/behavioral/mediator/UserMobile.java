package behavioral.mediator;

public class UserMobile extends User
{
	public UserMobile(Mediator mediator)
	{
		super(mediator);
	}
	
	@Override
	public void receive(String message)
	{
		System.out.println("Received on mobile: " + message);
	}
}