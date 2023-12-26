class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("John");
        human.setAge(25);
        System.out.println("Name: " + human.getName());
        System.out.println("Age: " + human.getAge());
    }
}
