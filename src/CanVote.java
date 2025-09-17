import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (canVote(age)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

    }
    public static boolean canVote(int age) {
        return age >= 18;
    }
}
