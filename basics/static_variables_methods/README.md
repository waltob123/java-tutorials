# Static Variables and Methods

The word static is used before a variable in a class when you want the class have a common value for a 
variable.

For instance if you want a Phone class to have type as smartphone. (ie all objects created from this class
will have the type as smartphone)

Example
```{java}
class Phone {
    String brand;
    double price;
    static String type;

    public void display() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class Demo {
    public static void main (String args[]) {
        Phone.type = "SmartPhone";
        Phone samsung = new Phone();
        Phone apple = new Phone();
        samsung.brand = "Samsung";
        samsung.price = "1990.00";
        apple.brand = "Apple";
        apple.price = "2000.oo";

        samsung.display();  // Samsung : 1990.00 : Smartphone
        System.out.println();
        apple.display();  // Apple : 2000.00 : SmartPhone
    }
}
```

From the code above whenever we create a new object from the phone class, it will have the type set to SmartPhone.

NB: To set the static variable we say <class_name>.<static_variable_name>

#

# Static Block

To instatiante a static variable, we use the static block.

Example

```{java}
class Phone {
    // instance variables
    String brand;
    double price;
    static String type;

    static {
        type = "SmartPhone";
    }

    public void display() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class Demo {
    public static void main (String args[]) {
        Phone samsung = new Phone();
        Phone apple = new Phone();
        samsung.brand = "Samsung";
        samsung.price = "1990.00";
        apple.brand = "Apple";
        apple.price = "2000.oo";

        samsung.display();  // Samsung : 1990.00 : Smartphone
        System.out.println();
        apple.display();  // Apple : 2000.00 : SmartPhone
    }
}
```
