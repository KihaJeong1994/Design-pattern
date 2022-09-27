# Adapter

https://refactoring.guru/design-patterns/adapter
## Intent
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate
=> 안 맞는 객체를 감싸서 맞는 객체로 만들어서 사용

## Problem
Imagine that you’re creating a stock market monitoring app. The app downloads the stock data from multiple sources in **XML** format and then displays nice-looking charts and diagrams for the user.

At some point, you decide to improve the app by integrating a smart 3rd-party analytics library. But there’s a catch: the analytics library only works with data in **JSON** format.

You could change the library to work with XML. However, this might break some existing code that relies on the library. And worse, you might not have access to the library’s source code in the first place, making this approach impossible.

## Solution
You can create an **_adapter_**. This is a special object that **converts** the **interface** of one object so that another object can understatnd it.

An **adapter** **wraps** one of the objects to **hide** the **complexity** of **conversion** happening behind the scenes. The wrapped object isn't even aware of the adapter. 

Adapters can not only convert data into various formats but can also help objects with different interfaces collaborate. Here's how it works:

1. The adapter gets an interface, compatible with one of the existing objects.
2. Using this interface, the existing object can safely call the adapter's methods.
3. Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.

## Applicability
Use the Adapter class when you want to use some existing class, but its interface isn't compatible with the rest of your code.

Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can't be added to the superclass.

![](https://refactoring.guru/images/patterns/diagrams/adapter/example-2x.png)