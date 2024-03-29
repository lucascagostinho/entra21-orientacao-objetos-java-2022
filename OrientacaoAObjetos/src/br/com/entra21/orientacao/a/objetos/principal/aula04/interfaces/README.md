# Interfaces in Java

An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritance in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. Java Interface also represents the IS-A relationship.

Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). 

* Interfaces specify what a class must do and not how. It is the blueprint of the class.
  
* An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
  
* If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.

Sintax:
```java
interface {

    // declare constant fields
    // declare methods that abstract 
    // by default.   
}
```

> To declare an interface, use the interface keyword. It is used to provide total abstraction. That means all the methods in an interface are declared with an empty body and are public and all fields are public, static, and final by default. A class that implements an interface must implement all the methods declared in the interface. To implement interface use implements keyword.

<br>

## Why do we use an Interface?
* It is used to achieve total abstraction.
  
* Since Java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
 
* It is also used to achieve loose coupling.
  
* Interfaces are used to implement abstraction.

```java
// A simple interface

interface Player
{
    final int id = 10;
    int move();
}
```

## Difference Between Class and Interface

<br>

| Class | Interface |
| :---: | :-----------: |
| In class, you can instantiate variables and create an object. | In an interface, you can’t instantiate variables and create an object. |
| Class can contain concrete(with implementation) methods     | The interface cannot contain concrete(with implementation) methods |
|The access specifiers used with classes are private, protected, and public.| In Interface only one specifier is used- Public. |

## Advantages of Interfaces in Java

The advantages of using interfaces in Java are as follows:

* Without bothering about the implementation part, we can achieve the security of the implementation.
  
* In Java, multiple inheritance is not allowed, however, you can use an interface to make use of it as you can implement more than one interface.