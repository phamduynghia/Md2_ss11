package bt9;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> students = new ArrayList<>();

    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }
//    xóa
    public void removeStudent(int studentId) {
        Student studentToRemove = findStudentById(studentId);
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Removed student with ID: " + studentId);
        } else {
            System.out.println("Student with ID: " + studentId + " not found.");
        }
    }
//    tìm
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Student with ID: " + studentId + " not found.");
        return null;
    }
//    tính DTB
    public double getAverageScore() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalScore = 0.0;
        for (Student student : students) {
            totalScore += student.getAverageScore();
        }
        return totalScore / students.size();
    }

// sắp xếp
    public void sortByScore() {
        students.sort((s1, s2) -> Double.compare(s1.getAverageScore(), s2.getAverageScore()));
    }
}
