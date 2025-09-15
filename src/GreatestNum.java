import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // smallest possible integer
        int num;

        while (true) {
            System.out.print("Enter an integer (0 to exit): ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number is: " + max);
        }
    }
}

