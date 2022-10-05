# Singleton
https://refactoring.guru/design-patterns/singleton/java/example#example-2
Singleton is a creational design pattern that lets you **ensure** that a class has **only one instance**, while providing a **global access** point to this instance.

## Intent
1. Ensure that a class has just a **single instance**. Why would anyone want to control how many instances a class has? The most common reason for this is to control access to some shared resource—for example, a database or a file.

2. Provide a **global access** point to that instance. Remember those global variables that you (all right, me) used to store some essential objects? While they’re very handy, they’re also very unsafe since any code can potentially overwrite the contents of those variables and crash the app. Just like a global variable, the Singleton pattern lets you access some object from anywhere in the program. However, it also protects that instance from being overwritten by other code.

## Solution
1. private constructor
2. static creation method that acts as constructor

## Applicability
Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.

 The Singleton pattern disables all other means of creating objects of a class except for the special creation method. This method either creates a new object or returns an existing one if it has already been created.