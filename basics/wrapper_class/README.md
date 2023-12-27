# Wrapper Class

All primitive types `(char, int, double, short, long, boolean)` all have classes which wraps around them.

`char` has `Char`

`int` has `Integer`

`double` has `Double`

`short` has `Short`

`long` has `Long`

`boolean` has `Boolean`

Eg
```{java}
public class Demo {
    public static void main (String args[]) {
        Integer num = 128;
        Char c = 'a';
        Double d = 4.5;
        Short s = 1;
        Long l = 8922212;
        Boolean = true;
    }
}
```

NB: These classes have some methods. For instance the `Integer` class has the `parseInt` method which converts strings which are integers `String num = "7";` to actual integers (ie `int num1 = Integer.parseInt(num);`). 
So now you can use num1 for mathematical operations.