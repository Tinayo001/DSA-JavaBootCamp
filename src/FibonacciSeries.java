import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers of Fibonacci to generate: ");
        int n = scanner.nextInt();

        fibonacci(n);
    }
    public static void fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");

            int next = f1 +  f2;
            f1 = f2;
            f2 = next;
        }
    }



}

