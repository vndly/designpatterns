package behavioral.specification;

public class IsGreaterThan extends CompositeSpecification<Integer>
{
	private final int lowerLimit;
	
	public IsGreaterThan(int lowerLimit)
	{
		this.lowerLimit = lowerLimit;
	}
	
	@Override
	public boolean isSatisfiedBy(Integer candidate)
	{
		return candidate > this.lowerLimit;
	}
}