# Abstract Factory
https://refactoring.guru/design-patterns/abstract-factory
## Intent
Abstract Factory is a creational desing pattern that lets you produce **families** of related objects **without specifying their concrete classes**

## Problem
Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent:

A family of related products, say: Chair + Sofa + CoffeeTable.

Several variants of this family. For example, products Chair + Sofa + CoffeeTable are available in these variants: Modern, Victorian, ArtDeco.

You need a way to create individual furniture objects so that they **match** other objects of the **same family**. Customers get quite mad when they receive non-matching furniture.

Also, you **don’t want to change existing code** when adding new products or families of products to the program. Furniture vendors update their catalogs very often, and you wouldn’t want to change the core code each time it happens.

## Solution
The first thing the Abstract Factory pattern suggests is to explicitly declare **interfaces** for each distinct **product** of the product family (e.g., chair, sofa or coffee table). Then you can make all variants of products follow those interfaces. For example, all chair variants can implement the Chair interface; all coffee table variants can implement the CoffeeTable interface, and so on.

The next move is to declare the **Abstract Factory**—an **interface with a list of creation methods** for all products that are part of the product family (for example, createChair, createSofa and createCoffeeTable). These methods must **return abstract product types represented by the interfaces** we extracted previously: Chair, Sofa, CoffeeTable and so on.

There’s one more thing left to clarify: if the client is only exposed to the abstract interfaces, what creates the actual factory objects? Usually, the application creates a **concrete factory object** at the **initialization** stage. Just before that, the app must select the factory type depending on the **configuration** or the **environment** settings.



![](https://refactoring.guru/images/patterns/diagrams/abstract-factory/example-2x.png)
This example illustrates how the Abstract Factory pattern can be used for creating cross-platform UI elements **without coupling the client code to concrete UI classes**, while keeping all created elements **consistent** with a selected operating system.

## Applicability
Use the Abstract Factory when your code needs to work with **various families of related products**, but you **don’t want it to depend on the concrete classes** of those products—they might be unknown beforehand or you simply want to allow for future **extensibility**.