package structural.frontcontroller;

public class LocalProcessor implements Processor
{
	@Override
	public void process(String request)
	{
		System.out.println("Using local processor: " + request);
	}
}