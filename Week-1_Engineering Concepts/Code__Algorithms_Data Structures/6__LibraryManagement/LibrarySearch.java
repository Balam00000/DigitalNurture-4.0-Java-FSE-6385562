import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LibrarySearch {
    static Scanner sc = new Scanner(System.in);

    
    public static void linearSearch(Book[] books, String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.display();
                found = true;
            }
        }
        if (!found) System.out.println("Book not found.");
    }

   
    public static int binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Programming", "James Gosling"),
            new Book(102, "Data Structures", "Mark Allen Weiss"),
            new Book(103, "Design Patterns", "Erich Gamma"),
            new Book(104, "Algorithms", "Robert Sedgewick")
        };


        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        System.out.print("Enter book title to search (Linear): ");
        String title = sc.nextLine();
        linearSearch(books, title);

        System.out.print("Enter book title to search (Binary): ");
        title = sc.nextLine();
        int idx = binarySearch(books, title);
        if (idx != -1) books[idx].display();
        else System.out.println("Book not found.");
    }
}
