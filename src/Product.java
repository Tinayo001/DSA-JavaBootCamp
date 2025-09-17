import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

       double result = calculateProd(a, b);
       System.out.println(result);

    }
    public static double calculateProd(int a, int b) {
        return a * b;

    }
}
