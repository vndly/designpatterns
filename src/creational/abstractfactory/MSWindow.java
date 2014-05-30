package creational.abstractfactory;

public class MSWindow implements Window
{
	@Override
	public void setTitle(String title)
	{
		// Microsoft Windows specific behavior
	}
	
	@Override
	public void display()
	{
		System.out.println("Displaying Microsoft Windows window...");
	}
}