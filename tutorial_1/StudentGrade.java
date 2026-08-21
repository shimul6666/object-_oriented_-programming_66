package tutorial_1;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's marks (0-100): ");
        int marks = scanner.nextInt();
        
        // Logic to determine student grade
        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Grade: B");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("Grade: C");
        } else if (marks >= 0 && marks < 40) {
            System.out.println("Grade: F (Fail)");
        } else {
            System.out.println("Invalid marks entered!");
        }
        
        scanner.close();
    }
}