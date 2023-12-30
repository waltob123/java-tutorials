/**
 * This class represents a sample class with inner classes in Java.
 * Inner classes are classes that are defined within another class.
 * They can be used to logically group related classes together and
 * provide better encapsulation and organization of code.
 *
 * Syntax for defining an inner class:
 *     class OuterClass {
 *         // Outer class members and methods
 *
 *         class InnerClass {
 *             // Inner class members and methods
 *         }
 *     }
 *
 * Inner classes can access the members of the outer class, including
 * private members, and can also have their own members and methods.
 * They can be instantiated using the syntax: OuterClass.InnerClass obj = outerObj.new InnerClass();
 *
 * Example usage:
 *     OuterClass outerObj = new OuterClass();
 *     OuterClass.InnerClass innerObj = outerObj.new InnerClass();
 */
public class OuterClass {
    // Outer class members and methods

    public class InnerClass {
        // Inner class members and methods
    }
}
