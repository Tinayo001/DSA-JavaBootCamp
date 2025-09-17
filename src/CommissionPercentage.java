import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of sales you made: ");
        double salesAmount = scanner.nextDouble();

        double commission = calculateCommission(salesAmount);

        System.out.println("You made this commission: " + commission);
        System.out.println("Commission Percentage: 10%");
    }

    // Calculates commission amount from sales
    public static double calculateCommission(double salesAmount) {
        double commissionPercentage = 10; // fixed 10%
        return (commissionPercentage * salesAmount) / 100;
    }
}

