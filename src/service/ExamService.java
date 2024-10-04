package service;

import model.Exam;
import repository.ExamRepository;

import java.sql.SQLException;
import java.util.Set;

public class ExamService {

    private final ExamRepository examRepo = new ExamRepository();

    public void printAllExamsList() {
        try {
            Set<Exam> exams = this.examRepo.getAllExam();
            for (Exam exam : exams) {
                System.out.println(exam);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printCountOfExams() {
        try {
            int countOfExam = this.examRepo.getCountOfExams();
            System.out.println("exams: ".concat(String.valueOf(countOfExam)));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
