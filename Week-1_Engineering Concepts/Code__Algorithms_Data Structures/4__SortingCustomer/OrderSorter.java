import java.util.Scanner;

public class OrderSorter {
    static Scanner sc = new Scanner(System.in);

 
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    
    public static void displayOrders(Order[] orders) {
        for (Order o : orders) {
            o.display();
        }
    }

    
    public static Order[] inputOrders() {
        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));
            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Total Price: ");
            double price = sc.nextDouble();

            orders[i] = new Order(id, name, price);
        }

        return orders;
    }

    public static void main(String[] args) {
        System.out.println("== Customer Order Sorting ==");

        Order[] orders1 = inputOrders();
        Order[] orders2 = orders1.clone(); 

       
        System.out.println("\nSorting using Bubble Sort:");
        bubbleSort(orders1);
        displayOrders(orders1);

        
        System.out.println("\nSorting using Quick Sort:");
        quickSort(orders2, 0, orders2.length - 1);
        displayOrders(orders2);
    }
}
