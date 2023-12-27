# Abstract Keyword in Java

The `abstract` keyword in Java is used to create abstract classes and abstract methods. An abstract class is a class that cannot be instantiated and is meant to be subclassed. It serves as a blueprint for other classes to inherit from.

## Abstract Class

An abstract class is declared using the `abstract` keyword. It can have both abstract and non-abstract methods. However, an abstract class cannot be instantiated directly. It can only be used as a superclass for other classes.

### Syntax
```{java}
abstract class ClassName {
    // Abstract method declaration
    abstract void methodName();

    // Non-abstract method
    void anotherMethod() {
        // Method implementation
    }
}
```
