import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many numbers do you want to enter? ");
        int n = scanner.nextInt();

        Average(scanner, n);

    }
    public static void Average(Scanner scanner, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println("Enter a number" + (i +  1) + ":");
            int number = scanner.nextInt();

            sum += number;

        }
        double average = (double) sum / n;
        System.out.println("The average is " + average);
    }

}
