package behavioral.memento;

public class Originator
{
	private String state;
	
	public void set(String state)
	{
		System.out.println("Setting state to: " + state);
		this.state = state;
	}
	
	public Memento saveToMemento()
	{
		System.out.println("Saving to Memento...");
		
		return new Memento(this.state);
	}
	
	public void restoreFromMemento(Memento memento)
	{
		this.state = memento.state;
		System.out.println("State after restoring from Memento: " + this.state);
	}
}