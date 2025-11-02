package cursitschool13si14;

import java.util.Scanner;

public class SchoolGradeBook {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            GradeBook gradebook = new GradeBook();
            int choice;
            do {
                System.out.println(" SCHOOL GRADEBOOK SYSTEM ");
                System.out.println("1. Add Student");
                System.out.println("2. Assign Grade");
                System.out.println("3. View All Students and Averages");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter student ID: ");
                        String id = sc.nextLine();
                        gradebook.addStudent(name, id);
                        break;
                    case 2:
                        System.out.print("Enter student ID: ");
                        String sid = sc.nextLine();
                        System.out.print("Enter grade: ");
                        double grade = sc.nextDouble();
                        gradebook.assignGrade(sid, grade);
                        break;
                    case 3:
                        gradebook.displayAllStudents();
                        break;
                    case 4:
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);

            sc.close();
        }
    }