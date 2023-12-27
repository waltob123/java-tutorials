// package abstract_keyword;

abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void accelerate() {
        System.out.println("Accelerating...");
    }
}


class SportsCar extends Car {
    public void drive() {
        System.out.println("SportsCar driving...");
    }

    public void stop() {
        System.out.println("SportsCar stopping...");
    }
}


public class Abstract {
    public static void main(String args[]) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.drive();
        sportsCar.accelerate();
        sportsCar.stop();
    }
}
