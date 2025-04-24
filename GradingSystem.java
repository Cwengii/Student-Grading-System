import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        String[] students = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            students[i] = scanner.next();
            System.out.println("Enter score for " + students[i] + ":");
            scores[i] = scanner.nextInt();
        }

        System.out.println("\nGrades:");
        for (int i = 0; i < n; i++) {
            char grade = getGrade(scores[i]);
            System.out.println(students[i] + ": " + grade);
        }
        scanner.close();
    }

    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }
}