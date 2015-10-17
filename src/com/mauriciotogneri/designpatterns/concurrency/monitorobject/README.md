Monitor Object Pattern
======================

The monitor object pattern is a design patter in which an object whose methods are subject to mutual exclusion, prevents multiple objects from erroneously trying to use it at the same time. A monitor is a synchronization construct that allows threads to have both mutual exclusion and the ability to wait (block) for a certain condition to become true. Monitors also have a mechanism for signalling other threads that their condition has been met. A monitor consists of a mutex (lock) object and condition variables.