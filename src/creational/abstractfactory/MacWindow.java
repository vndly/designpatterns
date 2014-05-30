package creational.abstractfactory;

public class MacWindow implements Window
{
	@Override
	public void setTitle(String title)
	{
		// Mac OS specific behavior
	}
	
	@Override
	public void display()
	{
		System.out.println("Displaying Mac OS window...");
	}
}