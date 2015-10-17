package com.mauriciotogneri.designpatterns.behavioral.specification;

public abstract class CompositeSpecification<Type> implements Specification<Type>
{
	@Override
	public Specification<Type> and(Specification<Type> other)
	{
		return new AndSpecification<Type>(this, other);
	}
	
	@Override
	public Specification<Type> or(Specification<Type> other)
	{
		return new OrSpecification<Type>(this, other);
	}
	
	@Override
	public Specification<Type> not()
	{
		return new NotSpecification<Type>(this);
	}
}