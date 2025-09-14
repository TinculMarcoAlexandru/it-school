package cursitschool3;

import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take input
            System.out.print("Enter the student's score: ");
            double score = scanner.nextDouble();

            // Classify using nested ternary operators
            String grade = (score >= 90 && score <= 100) ? "A"
                    : (score >= 80) ? "B"
                    : (score >= 70) ? "C"
                    : (score >= 60) ? "D"
                    : "F";

            // Print result
            System.out.println("The student's grade is: " + grade);

            scanner.close();
        }
    }
