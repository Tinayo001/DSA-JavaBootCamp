import java.util.Scanner;
import java.text.DecimalFormat;

public class Depreciation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("#,##0.00");

        System.out.print("Enter the buying price of the car: ");
        double purchasePrice = scanner.nextDouble();

        System.out.print("Enter the selling price of the car: ");
        double resaleValue = scanner.nextDouble();

        System.out.print("How many months have you had the car? : ");
        int months = scanner.nextInt();

        if (months <= 0) {
            System.out.println("Months must be greater than 0.");
            return;
        }

        double depreciation = (purchasePrice - resaleValue) / months;

        System.out.println("The car depreciates by " + money.format(depreciation) + " per month.");
    }
}

