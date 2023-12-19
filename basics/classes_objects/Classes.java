class Calculator {
    String manufacturer = "Texas Instruments";
    String model = "TI-84 Plus";
    String color = "Black";
    int memory = 24;
    int height = 300;
    int width = 150;

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


public class Classes {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.manufacturer);
        System.out.println(calc.add(5, 7));
    }
}
