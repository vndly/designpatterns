package behavioral.specification;

public class IsEven extends CompositeSpecification<Integer>
{
	@Override
	public boolean isSatisfiedBy(Integer candidate)
	{
		return (candidate % 2) == 0;
	}
}