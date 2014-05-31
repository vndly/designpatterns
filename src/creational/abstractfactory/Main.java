package creational.abstractfactory;

public class Main
{
	public static void main(String[] args)
	{
		GuiBuilder builder = new GuiBuilder();
		AbstractWindowFactory windowFactory = null;
		String platform = System.getProperty("os.name").toLowerCase();
		
		if (platform.startsWith("mac"))
		{
			windowFactory = new MacWindowFactory();
		}
		else
		{
			windowFactory = new LinuxWindowFactory();
		}
		
		builder.buildWindow(windowFactory);
	}
}