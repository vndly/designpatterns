package behavioral.iterator;

public interface Collection<Type>
{
	public void add(Type student);
	
	public void remove(Type student);
	
	public Iterator<Type> iterator();
}