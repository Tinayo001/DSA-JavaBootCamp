import java.awt.Point;
import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point point1 = new Point();
        Point point2 = new Point();

        System.out.print("Enter x1: ");
        point1.x = scanner.nextInt();

        System.out.println("Enter y1: ");
        point1.y = scanner.nextInt();

        System.out.println("Enter x2: ");
        point2.x = scanner.nextInt();

        System.out.println("Enter y2: ");
        point2.y = scanner.nextInt();

        double distance = calculateDistance(point1, point2);

        System.out.println("The distance between the two points is: " + distance);


    }
    public static double calculateDistance(Point point1, Point point2) {
        double x1 = point1.x;
        double y1 = point1.y;

        double x2 = point2.x;
        double y2 = point2.y;

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

    }


}

