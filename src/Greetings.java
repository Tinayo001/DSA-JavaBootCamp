import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        Greetings(name);
    }
    public static void Greetings(String name) {
        System.out.println("Habari ya leo Mr " + name);
    }
}
