# Factory Method

## Intent
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created

## Problem
You have code coupled to the *Truck* class. Now, you need to add Ships into the app.

## Solution
The Factory Method pattern suggests that you replace direct object construction calls(using the *new* operator) with **calls to a special *factory* method**.

The code that uses the factory method (often called the client code) doesn’t see a difference between the actual products returned by various subclasses. The client treats all the products as abstract Transport. The client knows that all transport objects are supposed to have the deliver method, but exactly how it works isn’t important to the client.

![](https://refactoring.guru/images/patterns/diagrams/factory-method/example-2x.png)

## Applicability
Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.