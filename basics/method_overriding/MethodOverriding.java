class Calculator {
    private String model;
    private String type;

    public Calculator() {
        this.model = "Unknown";
        this.type = "Unknown";
    }

    public Calculator(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }
}


class AdvancedCalculator extends Calculator {
    public AdvancedCalculator(String model, String type) {
        super(model, type);
        System.out.println(this.getModel() + " " + this.getType());
    }

    public double power(int x, int y) {
        return Math.pow(x, y);
    }

    public int add(int x, int y) {
        return x + y + 100;
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator("Casio", "Scientific");
        System.out.println(calc.add(10, 20));
        System.out.println(calc.power(3, 2));
    }
}
