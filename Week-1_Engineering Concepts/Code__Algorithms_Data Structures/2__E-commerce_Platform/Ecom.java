import java.util.*;

class product {
    int productId;
    String productName;
    String category;

    public product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class Ecom {
   
    public static product linearSearch(product[] products, int id) {
        for (product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    
    public static product binarySearch(product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        product[] products = new product[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new product(id, name, category);
        }

        
        System.out.print("\nEnter product ID to search (Linear Search): ");
        int linearId = sc.nextInt();
        product resultLinear = linearSearch(products, linearId);
        if (resultLinear != null) {
            System.out.println("Found (Linear): " + resultLinear.productName + " - " + resultLinear.category);
        } else {
            System.out.println("Product not found (Linear Search).");
        }
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        
        System.out.print("\nEnter product ID to search (Binary Search): ");
        int binaryId = sc.nextInt();
        product resultBinary = binarySearch(products, binaryId);
        if (resultBinary != null) {
            System.out.println("Found (Binary): " + resultBinary.productName + " - " + resultBinary.category);
        } else {
            System.out.println("Product not found (Binary Search).");
        }

        sc.close();
    }
}
