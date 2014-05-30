package creational.abstractfactory;

public class MSWindowFactory implements AbstractWindowFactory
{
	@Override
	public Window createWindow()
	{
		MSWindow window = new MSWindow();
		
		return window;
	}
}