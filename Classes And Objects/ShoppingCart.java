package OOps_Basic;

import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
    }

    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equals(itemName));
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 50000, 1));
        cart.addItem(new CartItem("Mouse", 500, 2));
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}