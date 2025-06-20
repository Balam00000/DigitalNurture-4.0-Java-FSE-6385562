public class Main1 {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2=Logger.getInstance();
        logger2.log("Continuing application...");

         if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works).");
         }
         else {
            System.out.println("Different instances exist (Singleton failed).");
        }
    }
}
