import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.println("Enter the third number");
        int third = scanner.nextInt();

        int largest = MaximumNumber(first, second, third);
        int smallest = MinimumNumber(first, second, third);

        System.out.println("The largest number is : " + largest);
        System.out.println("The smallest number is : " + smallest);

    }
    public static int MaximumNumber(int first, int second, int third) {
        int max = first;

        if (second > max)
            max = second;
        if (third > max) {
            max = third;
        }
        return max;
     }
     public static int MinimumNumber(int first, int second, int third) {
        int min = first;

        if (second < min)
            min = second;
        if (third < min) {
            min = third;
        }
        return min;
     }
}
