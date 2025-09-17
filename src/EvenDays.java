import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 31;
        int count = evenDays(number);
        System.out.println("Kunal can go out on " + count + " days in August.");
    }
    public static int evenDays(int number) {
        int days = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println("Day " + i);
                days++;
            }

        }
        return days;

    }

}
