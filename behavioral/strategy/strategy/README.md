# Strategy
https://refactoring.guru/design-patterns/strategy

## Intent
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Problem

1. There are lots of **algorithms** to apply
2. Any change to one of the algorithms affects the whole class
3. merge conflict -> inefficient teamwork

## Solution
The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called *strategies*.

- strategies : a separate class with all of algorithms
- context : the original class. It must have a field for storing a reference to one of the strategies.

![](https://refactoring.guru/images/patterns/diagrams/strategy/structure-2x.png)

## Applicability

Use the Strategy pattern when

- you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime
- you have a lot of similar classes that only differ in the way they execute some behavior
- to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic
- your class has a massive conditional statement that switches between different variants of the same algorithm

## Example

- java.util.Comparator#compare()