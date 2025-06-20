public class Main6 {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        System.out.println("First time displaying image1:");
        image1.display(); 
        System.out.println("\nSecond time displaying image1:");
        image1.display();  

        System.out.println("\nFirst time displaying image2:");
        image2.display();  
    }
}
