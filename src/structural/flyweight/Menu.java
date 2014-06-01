package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Menu
{
	private final Map<String, CoffeeFlavour> flavours = new HashMap<String, CoffeeFlavour>();
	
	public CoffeeFlavour lookup(String flavorName)
	{
		if (!this.flavours.containsKey(flavorName))
		{
			this.flavours.put(flavorName, new CoffeeFlavour(flavorName));
		}
		
		return this.flavours.get(flavorName);
	}
	
	public int totalCoffeeFlavoursMade()
	{
		return this.flavours.size();
	}
}