Lazy Initialization Pattern
===========================

The lazy initialization pattern is a design pattern which allows to delay the creation of an object until the first time it is needed. It combines 3 ideas:

* Using a factory method to get instances of a class (factory method pattern)
* Store the instances in a map, so you get the same instance the next time you ask for an instance with same parameter (multiton pattern)
* Using lazy initialization to instantiate the object the first time it is requested (lazy initialization pattern)