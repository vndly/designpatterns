package behavioral.iterator;

public interface Iterator<Type>
{
	public boolean hasNext();
	
	public Type next();
}