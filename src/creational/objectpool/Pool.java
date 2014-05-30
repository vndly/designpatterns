package creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class Pool<Type>
{
	private final List<Type> freeObjects;
	private final ObjectPoolFactory<Type> factory;
	private final int maxSize;
	
	public Pool(ObjectPoolFactory<Type> factory, int maxSize)
	{
		this.factory = factory;
		this.maxSize = maxSize;
		this.freeObjects = new ArrayList<Type>();
	}
	
	public Type newObject()
	{
		Type object = null;
		
		if (this.freeObjects.isEmpty())
		{
			object = this.factory.createObject();
		}
		else
		{
			object = this.freeObjects.remove(this.freeObjects.size() - 1);
		}
		
		return object;
	}
	
	public void free(Type object)
	{
		if (this.freeObjects.size() < this.maxSize)
		{
			this.freeObjects.add(object);
		}
	}
}