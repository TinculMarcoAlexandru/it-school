package cursitschool13si14;

import java.util.ArrayList;
import java.util.List;

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
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Average Grade: %.2f",
                studentId, name, calculateAverage());
    }
}


