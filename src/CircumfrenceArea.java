import java.util.Scanner;

public class CircumfrenceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of a circle");
        double radius = scanner.nextDouble();

        double area = calculateArea(radius);

        System.out.println("The area of the circle is " + area);

        double circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle is " + circumference);

    }
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
