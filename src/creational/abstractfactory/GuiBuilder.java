package creational.abstractfactory;

public class GuiBuilder
{
	public void buildWindow(AbstractWindowFactory windorFactory)
	{
		Window window = windorFactory.createWindow();
		window.display();
	}
}