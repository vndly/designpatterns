Prototype Pattern
=================

The prototype pattern is a design pattern which is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. This pattern is used to:

* Avoid subclasses of an object creator in the client application, like the abstract factory pattern does
* Avoid the inherent cost of creating a new object in the standard way (i.e., using the new keyword) when it is prohibitively expensive for a given application

The client, instead of writing code that invokes the new operator on a hard-coded class name, calls the `clone()` method on the prototype, calls a factory method with a parameter designating the particular concrete derived class desired, or invokes the `clone()` method through some mechanism provided by another design pattern.