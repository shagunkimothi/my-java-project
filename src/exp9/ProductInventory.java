package exp9;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {

    public static void main(String[] args) {
        // Step 1: Create HashMap to store productId and quantity
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Step 2: Add 3 products (productId → quantity)
        inventory.put(1001, 50);  // Product ID 1001 has 50 items
        inventory.put(1002, 30);
        inventory.put(1003, 20);

        // Step 3: Update quantity of product with ID 1002
        inventory.put(1002, 45);  // updated quantity

        // Step 4: Remove product with ID 1001
        inventory.remove(1001);

        // Step 5: Display final inventory
        System.out.println("Final Product Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}

