Null Object Pattern
===================

The null object pattern is a design pattern which avoids null references by providing a default object. Instead of using a null reference to convey absence of an object (for instance, a non-existent customer), one uses an object which implements the expected interface, but whose method body is empty. The advantage of this approach over a working default implementation is that a Null Object is very predictable and has no side effects: it does nothing.