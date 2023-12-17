class Operators {
    public static void main (String args[]) {
        int yearOfBirth = 1995;
        int currentYear = 2023;

        int age = currentYear - yearOfBirth;  // subtraction operator (returns difference)

        System.out.println("Age: " + age);

        int oranges = 5;
        int people = 3;
        int orangesPerPerson = oranges / people;  // division operator (returns quotient)
        int orangesLeft = oranges % people;  // modulo operator (returns remainder)
        System.out.println("Oranges per person: " + orangesPerPerson);
        System.out.println("Oranges left: " + orangesLeft);

        int apples = 10;
        int totalFruits = oranges + apples;  // addition operator (returns sum)
        System.out.println("Total fruits: " + totalFruits);

        int rows = 5;
        int columns = 4;
        int totalCells = rows * columns;  // multiplication operator (returns product)
        System.out.println("Total cells: " + totalCells);

        // increase oranges by 1
        oranges = oranges + 1;
        // or
        oranges += 1;
        // or
        oranges++;
        System.out.println("Oranges: " + oranges);

        // decrease apples by 1
        apples = apples - 1;
        // or
        apples -= 1;
        // or
        apples--;
        System.out.println("Apples: " + apples);
    }
}