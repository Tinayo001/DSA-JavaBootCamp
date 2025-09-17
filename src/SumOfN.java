import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers to enter");
        int n = scanner.nextInt();

        System.out.println("The sum of the numbers is :" + SumOfNnumbers(scanner, n));

    }
    public static double SumOfNnumbers(Scanner scanner, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println("Enter the number : " + (i + 1));
            int nums = scanner.nextInt();
            sum += nums;
        }
        return sum;
    }

}
