class Computer extends Object {
    String model;
    String manufacturer;
    int ramSize;

    public String toString() {
        return "<" + this.getClass().getName() + " class>";
    }
}


public class ObjectClass {
    public static void main(String args[]) {
        Computer laptop = new Computer();
        laptop.model = "MacBook Pro";
        laptop.manufacturer = "Apple";
        laptop.ramSize = 16;
        System.out.println(laptop);
    }
}
