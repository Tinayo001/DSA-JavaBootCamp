import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input time
        System.out.print("Enter the time (in years): ");
        int years = scanner.nextInt();

        // Input rate
        System.out.print("Enter the rate of interest (% per year): ");
        double rate = scanner.nextDouble();

        // Validate input
        if (principal <= 0 || years <= 0 || rate <= 0) {
            System.out.println("❌ Error: Principal, time, and rate must all be positive values.");
            return;
        }

        // Calculate interest
        double interest = calculateSimpleInterest(principal, rate, years);

        // Total amount
        double totalAmount = principal + interest;

        // Display results
        System.out.printf("✅ Simple Interest = %.2f%n", interest);
        System.out.printf("💰 Total Amount to Pay = %.2f%n", totalAmount);
    }

    /**
     * Calculates simple interest using the formula:
     * SI = (P × R × T) / 100
     *
     * @param principal Principal amount
     * @param rate      Annual interest rate in percentage
     * @param time      Time in years
     * @return Calculated simple interest
     */
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}
