package service;

import model.Student;
import repository.StudentRepository;

import java.sql.SQLException;
import java.util.Set;

public class StudentService {
    private final StudentRepository studentRepository = new StudentRepository();

    public void printAllStudentsList() {
        try {
            Set<Student> students = this.studentRepository.getAllStudents();
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printCountOfStudents() {
        try {
            int countOfStudent = this.studentRepository.getCountOfStudents();
            System.out.println("students: ".concat(String.valueOf(countOfStudent)));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}