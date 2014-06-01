package structural.flyweight;

public class Order
{
	private final int tableNumber;
	private final CoffeeFlavour flavour;
	
	public Order(int tableNumber, CoffeeFlavour flavor)
	{
		this.tableNumber = tableNumber;
		this.flavour = flavor;
	}
	
	public void serve()
	{
		System.out.println("Serving: " + this.flavour + " to table " + this.tableNumber);
	}
}