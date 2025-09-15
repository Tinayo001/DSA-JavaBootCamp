import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ShowMenu();

            System.out.print("Choose an operation (1-4) or 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye, exiting...");
                break;
            }

            System.out.print("Enter the first number: ");
            int int1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int int2 = scanner.nextInt();

            int result = 0;

            switch (choice) {
                case 1:
                    result = int1 * int2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    if (int2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        result = int1 / int2;
                        System.out.println("Result = " + result);
                    }
                    break;

                case 3:
                    result = int1 - int2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    result = int1 + int2;
                    System.out.println("Result = " + result);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void ShowMenu() {
        System.out.println("\n-- Calculator Menu --");
        System.out.println("1. Multiplication (*)");
        System.out.println("2. Division (/)");
        System.out.println("3. Subtraction (-)");
        System.out.println("4. Addition (+)");
    }
}



