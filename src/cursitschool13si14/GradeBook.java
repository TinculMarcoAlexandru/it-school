package cursitschool13si14;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Student> students;

    public GradeBook() {
        this.students = new HashMap<>();
    }

    public void addStudent(String name, String id) {
        if (students.containsKey(id)) {
            System.out.println("A student with this ID already exists!");
            return;
        }
        students.put(id, new Student(name, id));
        System.out.println("Student added successfully!");
    }

    public void assignGrade(String id, double grade) {
        Student student = students.get(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        student.addGrade(grade);
        System.out.println("Grade added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the class yet.");
            return;
        }
        System.out.println(" Student List ");
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }
}
