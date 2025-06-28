package OOps_Basic;

public class Mobiles {
    public static void main(String[] args) {
        MobileDetails mobile1 = new MobileDetails("Galaxy S21", "Samsung", 799.99);
        MobileDetails mobile2 = new MobileDetails("iPhone 13", "Apple", 999.99);
        MobileDetails mobile3 = new MobileDetails("Pixel 6", "Google", 599.99);

        System.out.println("Mobile 1: " + mobile1.model + ", Brand: " + mobile1.brand + ", Price: $" + mobile1.price);
        System.out.println("Mobile 2: " + mobile2.model + ", Brand: " + mobile2.brand + ", Price: $" + mobile2.price);
        System.out.println("Mobile 3: " + mobile3.model + ", Brand: " + mobile3.brand + ", Price: $" + mobile3.price);
    }
}
class MobileDetails {
    String brand;
    String model;
    double price;

    MobileDetails(String mobileName, String brandName, double price) {
        this.model = mobileName;
        this.brand = brandName;
        this.price = price;
    }
}
