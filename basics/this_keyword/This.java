class Phone {
    private String brand;
    private String model;
    private int price;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}

public class This {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("Apple");
        phone.setModel("iPhone 12");
        phone.setPrice(1000);
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: " + phone.getPrice());
    }    
}
