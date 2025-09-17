import java.util.Scanner;

public class GradingGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (out of 100): ");
        int score = scanner.nextInt();

        String grade = getGrade(score);
        System.out.println("Marks: " + score + "  Grade: " + grade);
    }

    public static String getGrade(int score) {
        if (score >= 91 && score <= 100) {
            return "AA";
        } else if (score >= 81 && score <= 90) {
            return "AB";
        } else if (score >= 71 && score <= 80) {
            return "BB";
        } else if (score >= 61 && score <= 70) {
            return "BC";
        } else if (score >= 51 && score <= 60) {
            return "CD";
        } else if (score >= 41 && score <= 50) {
            return "DD";
        } else if (score <= 40 && score >= 0) {
            return "Fail";
        } else {
            return "Invalid score (must be 0–100)";
        }
    }
}

