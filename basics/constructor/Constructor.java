class Phone {
    private String brand;
    private String model;
    private int price;
    static String type;

    static {
        type = "Smartphone";
    }

    public Phone() {
        this.brand = "Samsung";
        this.model = "Galaxy S10";
    }

    public Phone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

public class Constructor {
    public static void main(String args[]) {
        Phone phone = new Phone("Apple", "iPhone 11", 699);
        System.out.println(phone.getBrand());
    }
}
