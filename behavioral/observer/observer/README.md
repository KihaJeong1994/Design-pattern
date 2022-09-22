# Observer Pattern

## Intent
Observer is a behavioral design pattern that lets you define a <span style="color:violet">**subscription mechanism**</span> to <span style="color:violet">**notify**</span> multiple objects about any <span style="color:violet">events</span> that happen to the object they're observing

## Problem
Imagine that you have two types of objects: a Customer and a Store. The customer is very interested in a particular brand of product (say, it’s a new model of the iPhone) which should become available in the store very soon.

The customer could visit the store every day and check product availability. But while the product is still en route, most of these trips would be pointless.

On the other hand, the store could send tons of emails (which might be considered spam) to all customers each time a new product becomes available. This would save some customers from endless trips to the store. At the same time, it’d upset other customers who aren’t interested in new products.


## Applicability
Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.

![](https://refactoring.guru/images/patterns/diagrams/observer/example-2x.png)
