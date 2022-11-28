# Builder

## Intent
Builder is a creational design pattern that lets you **construct complex objects step by step**. The pattern allows you to produce different types and representations of an object using the **same** construction code.

## Problem
Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects. Such initialization code is usually buried inside a monstrous constructor with lots of parameters. Or even worse: scattered all over the client code.

Create Subclasses -> end up with a considerable number of subclasses
Create a giant constructor -> In most cases most of the parameters will be unused, making the constructor calls pretty ugly


## Solution
The Builder pattern suggests that you **extract the object construction code** **out** of its own class and move it to separate objects called **_builders_**.

The pattern organizes object construction into a set of **steps** (buildWalls, buildDoor, etc.). To create an object, you execute a series of these steps on a builder object. The important part is that **you don’t need to call all of the steps**. You can **call only those steps that are necessary** for producing a particular configuration of an object.

### Director
You can go further and extract a series of calls to the builder steps you use to construct a product into a separate class called **_director_**. The director class defines the order in which to execute the building steps, while the builder provides the implementation for those steps.

![](https://refactoring.guru/images/patterns/diagrams/builder/example-en-2x.png)

## Applicability
Use the Builder pattern to get rid of a “telescoping constructor”.

Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses)

Use the Builder to construct Composite trees or other complex objects.