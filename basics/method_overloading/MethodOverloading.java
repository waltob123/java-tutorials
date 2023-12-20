class Person {
    public String talk() {
        return "I am a person";
    }

    public String talk(String name) {
        return "I am " + name;
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Person desmond = new Person();
        System.out.println(desmond.talk());
        System.out.println(desmond.talk("Desmond"));
    }
}
