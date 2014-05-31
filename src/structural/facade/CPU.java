package structural.facade;

public class CPU
{
	public void start()
	{
		System.out.println("Starting...");
	}
	
	public void jump(long position)
	{
		System.out.println("Jumping to position: " + position);
	}
	
	public void execute()
	{
		System.out.println("Executing...");
	}
}