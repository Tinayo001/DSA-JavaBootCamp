import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();

            System.out.println("Choice the conversion you want");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye you are now exiting");
                break;
            }

            System.out.println("Enter the amount");
            double amount = scanner.nextDouble();


            double convertionRate = 130.00;
            double result;

            switch (choice) {

                case 1:
                    result = amount * convertionRate;
                    System.out.println(amount + " USD = " + result + " KSH");
                    break;

                case 2:
                    result = amount / convertionRate;
                    System.out.println(amount + " KSH = " + result + " USD");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }
    public static void showMenu() {
        System.out.println("\n--Currency convertor menu--");
        System.out.println("1. USD->KSH");
        System.out.println("2. KSH->USD");
    }

}

