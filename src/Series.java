import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to get its fibonacci series");
        int n = scanner.nextInt();

        fibonacci(n);

    }
    public static void fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;

        for (int i = 1; i <= n; i++) {
            int next = f1 + f2;

            f1 = f2;
            f2 = next;

            System.out.print(next + " ");

        }

    }

}
