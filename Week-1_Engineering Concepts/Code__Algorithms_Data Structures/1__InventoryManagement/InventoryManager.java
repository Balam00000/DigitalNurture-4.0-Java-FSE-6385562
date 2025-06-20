import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }
    

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setQuantity(quantity);
            p.setPrice(price);
        } else {
            System.out.println("Product ID not found.");
        }
    }

   
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) == null) {
            System.out.println("Product ID not found.");
        }
    }

    
    public void showInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
