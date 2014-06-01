package behavioral.mediator;

public class Main
{
	public static void main(String[] args)
	{
		Chat mediator = new Chat();
		
		UserDesktop desktop = new UserDesktop(mediator);
		UserMobile mobile = new UserMobile(mediator);
		
		mediator.addUser(desktop);
		mediator.addUser(mobile);
		
		desktop.send("Hello, Bob!");
		mobile.send("Hello, Peter!");
	}
}