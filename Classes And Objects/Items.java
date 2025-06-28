package OOps_Basic;

public class Items {
    public static void main(String[] args) {
        ItemDetails item1 = new ItemDetails("Laptop", "ITM001", 75000.00);
        ItemDetails item2 = new ItemDetails("Smartphone", "ITM002", 30000.00);
        ItemDetails item3 = new ItemDetails("Headphones", "ITM003", 1500.00);

        System.out.println("Item 1: " + item1.itemName + ", Code: " + item1.itemCode + ", Price: " + item1.itemPrice);
        System.out.println("Item 2: " + item2.itemName + ", Code: " + item2.itemCode + ", Price: " + item2.itemPrice);
        System.out.println("Item 3: " + item3.itemName + ", Code: " + item3.itemCode + ", Price: " + item3.itemPrice);
    }
}
class ItemDetails {
    String itemName;
    String itemCode;
    double itemPrice;

    ItemDetails(String itemName, String itemCode, double itemPrice) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
    }
}