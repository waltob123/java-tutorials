public class Conditionals {
    public static void main (String args[]) {
        int age = 17;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

        int x = -1;
        if (0 < x && x < 10) {
            System.out.println("x is a positive single digit.");
        } else {
            System.out.println("x is not a positive single digit.");
        }

        if (x >= 0 && x < 5) {
            System.out.println("range 5");
        } else if (x >= 5 && x < 10) {
            System.out.println("range 10");
        } else {
            System.out.println("out of range");
        }
    }
}