# Chain of Responsibility

https://refactoring.guru/design-patterns/chain-of-responsibility


## Intent
Chain of Responsibility is a behavioral design pattern that lets you pass **requests** **along a chain** of **handlers**. Upon receiving a request, each handler decides either to **process** the request or to **pass** it to the next handler in the chain.

## Problem
![](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/problem2-en-2x.png)
The code of the checks, which had already looked like a mess, became more and more bloated as you added each new feature. Changing one check sometimes affected the others. Worst of all, when you tried to reuse the checks to protect other components of the system, you had to duplicate some of the code since those components required some of the checks, but not all of them.

The system became very hard to comprehend and expensive to maintain. You struggled with the code for a while, until one day you decided to refactor the whole thing.

## Solution
Like many other behavioral design patterns, the Chain of Responsibility relies on transforming particular behaviors into **stand-alone objects** called **_handlers_**. Each check should be extracted to its **own class** with a **single method** that performs the check. The **request**, along with its data, is passed to this method as an **argument**.
(ex. Spring Cloud Gateway Filter)

The pattern suggests that you link these handlers into a chain. Each linked handler has a field for storing a reference to the next handler in the chain. In addition to processing a request, handlers pass the request further along the chain. The request travels along the chain until all handlers have had a chance to process it.

Here's the best part: a handler can decide not to pass the request down the chain and effectively stop any further processing.

However, there’s a slightly different approach (and it’s a bit more canonical) in which, upon receiving a request, a handler decides whether it can process it. If it can, it doesn’t pass the request any further. So it’s either only one handler that processes the request or none at all. This approach is very common when dealing with events in stacks of elements within a graphical user interface.

For instance, when a user clicks a button, the event propagates through the chain of GUI elements that starts with the button, goes along its containers (like forms or panels), and ends up with the main application window. The event is processed by the first element in the chain that’s capable of handling it. This example is also noteworthy because it shows that a chain can always be extracted from an object tree.

It’s crucial that all handler classes implement the same interface. Each concrete handler should only care about the following one having the execute method. This way you can compose chains at runtime, using various handlers without coupling your code to their concrete classes.

=> 두가지 타입. 하나는 request를 계속 다음 핸들러로 전달하는 것과, 두번째는 request를 한 핸들러에서 처리한 후 event만 전파

![](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/example-en-2x.png)

## Applicability
Use the Chain of Responsibility pattern when your program is expected to process different kinds of **requests** in **various way**, but the exact types of request and their **sequences** are unknown beforehand.