import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNegativeNumbers = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        while (true) {
            System.out.println("Ënter a number : ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number < 0) {
                sumOfNegativeNumbers += number;
            } else if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            } else {
                sumOfOddNumbers += number;
            }
        }
        System.out.println("The sum of negative numbers is : " + sumOfNegativeNumbers);
        System.out.println("The sum of even numbers is : " + sumOfEvenNumbers);
        System.out.println("The sum of odd numbers is : " + sumOfOddNumbers);

    }

}
