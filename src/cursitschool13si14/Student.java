package cursitschool13si14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String studentId ;
    private List<Double> grades;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if  ( grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();}


    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Average Grade: %.2f",
                studentId, name, calculateAverage());
    }
}

class Gradebook {
    private Map<String, Student> students;

    public Gradebook() {
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


