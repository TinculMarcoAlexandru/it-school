package cursitschool3;

import java.util.Scanner;

public class AgeClassification {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // Take input
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                // Classify using ternary operators
                String category = (age < 12) ? "Copil"
                        : (age <= 17) ? "Adolescent"
                        : (age <= 64) ? "Adult"
                        : "Senior";
                // Print result
                System.out.println("The person is classified as: " + category);

                scanner.close();
            }
        }

