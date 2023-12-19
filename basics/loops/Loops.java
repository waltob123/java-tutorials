public class Loops {
    public static void main(String args[]) {
        // while loop
        int i = 0, j = 0;
        while (i < 10) {
            System.out.println(i);
            while (j < 3) {
                System.out.println(j);
                j++;
            }
            j = 0;
            i++;
        }

        System.out.println("\n");

        // do-while loop
        i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        System.out.println("\n");

        // for loop
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
