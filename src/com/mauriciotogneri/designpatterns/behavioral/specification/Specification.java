package com.mauriciotogneri.designpatterns.behavioral.specification;

public interface Specification<Type>
{
    boolean isSatisfiedBy(Type candidate);

    Specification<Type> and(Specification<Type> other);

    Specification<Type> or(Specification<Type> other);

    Specification<Type> not();
}