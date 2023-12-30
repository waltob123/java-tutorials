# Lambda Expressions in Java

## Introduction
Lambda expressions are a powerful feature introduced in Java 8 that allows us to write more concise and expressive code. They provide a way to represent functional interfaces (interfaces with a single abstract method) as instances of a functional interface.

## Syntax
The syntax for a lambda expression consists of the following parts:
(parameter list) -> { 
    // body of the lambda expression
}

// Example 1: Lambda expression with no parameters
Runnable runnable = () -> {
    System.out.println("Hello, world!");
};

// Example 2: Lambda expression with a single parameter
Consumer<String> consumer = (name) -> {
    System.out.println("Hello, " + name + "!");
};

// Example 3: Lambda expression with multiple parameters
BinaryOperator<Integer> add = (a, b) -> a + b;

// Example 4: Lambda expression with a return statement
Supplier<String> supplier = () -> {
    return "Hello, world!";
};


