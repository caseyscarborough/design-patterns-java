# Design Patterns in Java

This repository contains the implementations of major design patterns in Java. This will eventually contain all of main Creational, Structural, and Behavioral patterns with structural and real-world examples.

Frequency of use images used from [DoFactory](http://www.dofactory.com).

## Singleton Pattern

The purpose of the Singleton design pattern is to ensure that a class only has one specific instance, and to provide a global point of access to that instance. This is useful when you do not want your class to be instantiated manually, and you need multiple classes to be able to access the same instance of your Singleton.

Frequency of use: ![](http://www.dofactory.com/Images/use_medium_high.gif)

#### Examples

* [Structural Example](https://github.com/caseyscarborough/design-patterns-java/tree/master/src/main/java/com/caseyscarborough/designpatterns/singleton/structural)
* [Practical Example](https://github.com/caseyscarborough/design-patterns-java/tree/master/src/main/java/com/caseyscarborough/designpatterns/singleton/practical)

#### Resources

The following are some useful resources for the Singleton Design Pattern:

* [Singleton Wikipedia Article](http://en.wikipedia.org/wiki/Singleton_pattern)
* [OODesign Singleton Pattern](http://www.oodesign.com/singleton-pattern.html)
* [DoFactory Singleton Pattern](http://www.dofactory.com/Patterns/PatternSingleton.aspx)

## Command Pattern

The Command Pattern is used primarily to encapsulate requests as an object, letting you parameterize clients with different requests, queue or log them, or add support for undoing operations. This is particularly useful when you'd like to keep track of actions a user has performed, and possibly undo them if the user would like to. CTRL+Z anybody? :)

Frequency of use: ![](http://www.dofactory.com/Images/use_medium_high.gif)

#### Examples

* [Structural Example](https://github.com/caseyscarborough/design-patterns-java/tree/master/src/main/java/com/caseyscarborough/designpatterns/command/structural)

#### Resources

* [Command Pattern Wikipedia Article](http://en.wikipedia.org/wiki/Command_pattern)
* [OODesign Command Pattern](http://www.oodesign.com/command-pattern.html)
* [DoFactory Command Pattern](http://www.dofactory.com/Patterns/PatternCommand.aspx)