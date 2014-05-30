package creational.abstractfactory;

public class GUIBuilder
{
	public void buildWindow(AbstractWindowFactory windorFactory)
	{
		Window window = windorFactory.createWindow();
		window.setTitle("New Window");
		window.display();
	}
}