import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter the investment amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();
        double rate = annualRate / 100; // convert % to decimal

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        // Calculate FV
        double futureValue = principal * Math.pow((1 + rate / n), n * years);

        // Output result
        System.out.printf("Future investment value after %d years = %.2f%n", years, futureValue);
    }
}
