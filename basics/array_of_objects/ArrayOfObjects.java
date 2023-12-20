class Student {
    String name;
    int rollNo;

    public String studentDescription() {
        return "Name: " + name + "\nRoll No: " + rollNo;
    }
}


public class ArrayOfObjects {
    public static void main(String[] args) {
        Student students[] = new Student[3];
        students[0] = new Student();
        students[0].name = "John";
        students[0].rollNo = 2;

        students[1] = new Student();
        students[1].name = "Jane";
        students[1].rollNo = 3;

        students[2] = new Student();
        students[2].name = "Jack";
        students[2].rollNo = 4;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].studentDescription());
            System.out.println();
        }
    }
}
