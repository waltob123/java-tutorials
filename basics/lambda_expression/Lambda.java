@FunctionalInterface
interface Calculator {
    public abstract int calculate(int x, int y);
}

@FunctionalInterface
interface Printer {
    public abstract void print(String message);
}

// implementing the interface using a class <1.0>
// class MyCalculator implements Calculator {
//     @Override
//     public int calculate(int x, int y) {
//         return x + y;
//     }
// }

public class Lambda {
    public static void main(String[] args) {
        // <1.0>
        // Calculator calculator = new MyCalculator();
        // System.out.println(calculator.calculate(1, 2));

        // <1.1>
        // Calculator calculator = new Calculator() {
        //     @Override
        //     public int calculate(int x, int y) {
        //         return x + y;
        //     }
        // };

        // System.out.println(calculator.calculate(1, 2));

        // <1.2>
        Printer printer = message -> System.out.println(message);
        printer.print("Hello World!");
    }
}
