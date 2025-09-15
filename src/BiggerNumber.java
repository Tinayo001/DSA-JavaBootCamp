import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first digit");
        int a = scanner.nextInt();

        System.out.println("Enter the second digit");
        int b = scanner.nextInt();

        BiggerDigit(a, b);

    }
    public static void BiggerDigit(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger number than " + b);
        } else if (b > a) {
            System.out.println(b + "is bigger number than " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
