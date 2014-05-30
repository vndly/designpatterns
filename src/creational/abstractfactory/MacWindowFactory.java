package creational.abstractfactory;

public class MacWindowFactory implements AbstractWindowFactory
{
	@Override
	public Window createWindow()
	{
		MacWindow window = new MacWindow();
		
		return window;
	}
}