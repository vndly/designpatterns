package creational.objectpool;

public interface ObjectPoolFactory<Type>
{
	public Type createObject();
}