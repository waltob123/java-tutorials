interface Computer {
    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void reset();

    public abstract void boot();

    public abstract void shutdown();

    public abstract void restart();

    public abstract void sleep();

    public abstract void hibernate();

    public abstract void lock();

    public abstract void unlock();

    public abstract void login();

    public abstract void logout();

}

class Laptop implements Computer {
    public void turnOn() {
        System.out.println("Laptop is turning on...");
    }

    public void turnOff() {
        System.out.println("Laptop is turning off...");
    }

    public void reset() {
        System.out.println("Laptop is resetting...");
    }

    public void boot() {
        System.out.println("Laptop is booting...");
    }

    public void shutdown() {
        System.out.println("Laptop is shutting down...");
    }

    public void restart() {
        System.out.println("Laptop is restarting...");
    }

    public void sleep() {
        System.out.println("Laptop is sleeping...");
    }

    public void hibernate() {
        System.out.println("Laptop is hibernating...");
    }

    public void lock() {
        System.out.println("Laptop is locking...");
    }

    public void unlock() {
        System.out.println("Laptop is unlocking...");
    }

    public void login() {
        System.out.println("Laptop is logging in...");
    }

    public void logout() {
        System.out.println("Laptop is logging out...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        laptop.turnOn();
        laptop.turnOff();
        laptop.reset();
        laptop.boot();
        laptop.shutdown();
        laptop.restart();
        laptop.sleep();
        laptop.hibernate();
        laptop.lock();
        laptop.unlock();
        laptop.login();
        laptop.logout();
    }
}
