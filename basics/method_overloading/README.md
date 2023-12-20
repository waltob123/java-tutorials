# Method Overloading

Method overloading is when two methods have the same name but different number of parameters are passed to each method.

Example.
```{java}
class Person {

    // Method 1
    public String talk() {
        return "I am a person";
    }

    // Method 2
    public String talk(String name) {
        return "I am " + name;
    }
}
```