class Phone {
    String brand;
    double price;
    // static String type = "Smartphone";
    static String type;

    static {
        type = "Smartphone";
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

    
}


public class StaticVariablesMethods {
    public static void main(String args[]) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        p1.brand = "Apple";
        p1.price = 999.99;

        p2.brand = "Samsung";
        p2.price = 899.99;

        p1.display();
        System.out.println();
        p2.display();
    }    
}
