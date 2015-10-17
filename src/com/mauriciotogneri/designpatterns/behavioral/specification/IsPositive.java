package com.mauriciotogneri.designpatterns.behavioral.specification;

public class IsPositive extends CompositeSpecification<Integer>
{
	@Override
	public boolean isSatisfiedBy(Integer candidate)
	{
		return (candidate >= 0);
	}
}