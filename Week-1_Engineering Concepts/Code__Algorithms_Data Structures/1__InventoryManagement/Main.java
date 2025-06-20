import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();

        
        System.out.print("Enter number of products to add: ");
        int n = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product p = new Product(id, name, qty, price);
            manager.addProduct(p);
        }

        System.out.println("\nInitial Inventory:");
        manager.showInventory();

        
        System.out.print("\nEnter product ID to update: ");
        int updateId = sc.nextInt();

        System.out.print("New quantity: ");
        int newQty = sc.nextInt();

        System.out.print("New price: ");
        double newPrice = sc.nextDouble();

        manager.updateProduct(updateId, newQty, newPrice);

        // Delete product
        System.out.print("\nEnter product ID to delete: ");
        int deleteId = sc.nextInt();
        manager.deleteProduct(deleteId);

        System.out.println("\nAfter Update and Delete:");
        manager.showInventory();

        sc.close();
    }
}
