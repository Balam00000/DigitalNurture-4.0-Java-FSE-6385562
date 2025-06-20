import java.util.Scanner;

public class FinancialForecast {

    
    public static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; 
        }
        return (1 + growthRate) * futureValue(currentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years to predict: ");
        int years = scanner.nextInt();

        double result = futureValue(currentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f\n", years, result);

        scanner.close();
    }
}
