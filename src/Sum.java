import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // declare sum OUTSIDE the loop
        int n;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            n = scanner.nextInt();

            if (n == 0) {
                break; // stop if user enters 0
            }

            sum += n; // add the number to the sum
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}

