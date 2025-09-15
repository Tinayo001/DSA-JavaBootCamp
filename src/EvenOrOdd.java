import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter and number ");
        int n = scanner.nextInt();

        EvenOrOdd(n);

    }
    public static void EvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
