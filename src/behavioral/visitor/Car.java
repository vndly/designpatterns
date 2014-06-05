package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarElement
{
	private final List<CarElement> elements = new ArrayList<CarElement>();
	
	public Car()
	{
		this.elements.add(new Wheel());
		this.elements.add(new Wheel());
		this.elements.add(new Wheel());
		this.elements.add(new Wheel());
		this.elements.add(new Body());
		this.elements.add(new Engine());
	}
	
	@Override
	public void accept(CarElementVisitor visitor)
	{
		for (CarElement element : this.elements)
		{
			element.accept(visitor);
		}
		
		visitor.visit(this);
	}
}