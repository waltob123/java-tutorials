package exceptions;

class DenominatorIsGreaterException extends Exception {
    public DenominatorIsGreaterException(String message) {
        super(message);
    }
}

public class TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        try {
            result = a / b;

            if (b > a) {
                throw new DenominatorIsGreaterException("Denominator is greater than numerator");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (DenominatorIsGreaterException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Result: " + result);
    }    
}
