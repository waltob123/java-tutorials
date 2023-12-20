public class Array {
    public static void main(String args[]) {
        int ages[] = { 17, 18, 19, 20 };
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] > 17 ? "You are eligible to vote" : "You are not eligible to vote");
        }

        // Alternate way to create an array
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
