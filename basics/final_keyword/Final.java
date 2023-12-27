public class Final {
    public static void main(String args[]) {
        final String model = "Mustang";
        model = "Ferrari"; // Compile time error: "cannot assign a value to final variable model
        System.out.println(model);
    }
}
