package creational.abstractfactory;

public class Main
{
	public static void main(String[] args)
	{
		GUIBuilder builder = new GUIBuilder();
		AbstractWindowFactory windowFactory = null;
		String platform = System.getProperty("os.name").toLowerCase();
		
		if (platform.startsWith("win"))
		{
			windowFactory = new MSWindowFactory();
		}
		else
		{
			windowFactory = new MacWindowFactory();
		}
		
		builder.buildWindow(windowFactory);
	}
}