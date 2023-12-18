public class LogicalOperators {
    public static void main (String args[]) {
        int age = 19;
        boolean valid = age > 17 && age < 26;  // (age > 17) AND (age < 26)
        boolean valid2 = age > 17 || age < 26; // (age > 17) OR (age < 26)
        boolean valid3 = !(age > 17); // NOT (age > 17)
        System.out.println(valid);
        System.out.println(valid2);
        System.out.println(valid3);
    }
}