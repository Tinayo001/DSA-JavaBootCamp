import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original price of the product");
        double OriginalPrice = scanner.nextDouble();

        System.out.println("Enter the new price of the product");
        double NewPrice = scanner.nextDouble();

        calculateDiscount(OriginalPrice, NewPrice);
    }
    public static void calculateDiscount(double OriginalPrice, double NewPrice) {
        double discount = OriginalPrice - NewPrice;
        System.out.println("The discount is " + discount);

        double discountPercentage = (discount / OriginalPrice) * 100;

        System.out.println("The discount percentage is " + discountPercentage + " %");
    }
}
