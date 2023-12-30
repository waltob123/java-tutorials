# Exceptions in Java

Exceptions are a way to handle errors and exceptional situations in Java programs. When an error occurs, an exception is thrown, which can be caught and handled by the program.

## Types of Exceptions

Java has two types of exceptions: checked exceptions and unchecked exceptions.

### Checked Exceptions

Checked exceptions are exceptions that the compiler requires you to handle or declare. These exceptions are checked at compile-time, and if not handled properly, the program will not compile. Examples of checked exceptions include `IOException`, `SQLException`, and `ClassNotFoundException`.

### Unchecked Exceptions

Unchecked exceptions, also known as runtime exceptions, are exceptions that do not need to be explicitly handled or declared. These exceptions are not checked at compile-time, and if not handled, they will result in a runtime error. Examples of unchecked exceptions include `NullPointerException`, `ArrayIndexOutOfBoundsException`, and `ArithmeticException`.

## Handling Exceptions

To handle exceptions in Java, you can use the `try-catch` block. The `try` block contains the code that may throw an exception, and the `catch` block handles the exception if it occurs.

Here's an example of how to handle an exception:
```{java}
try {
    // Code that may throw an exception
    // ...
} catch (Exception e) {
    // Code to handle the exception
    // ...
}
```
