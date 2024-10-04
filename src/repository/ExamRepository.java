package repository;

import model.Exam;
import model.Student;
import util.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;


public class ExamRepository {

    private static final String GET_ALL_EXAM_QUERY = "SELECT * FROM exams";
    private static final String GET_COUNT_OF_EXAMS = "SELECT count(*) FROM exams";

    private final Database database = new Database();

    public int getCountOfExams() throws SQLException {
        ResultSet countResult = database.getSQLStatement().executeQuery(GET_COUNT_OF_EXAMS);
        int count = 0;
        while (countResult.next()) {
            count = countResult.getInt("count");
        }
        return count;
    }

    public Set<Exam> getAllExam() throws SQLException {
        ResultSet examsResult = database.getSQLStatement().executeQuery(GET_ALL_EXAM_QUERY);
        Set<Exam> exams = new HashSet<>();
        while (examsResult.next()) {
            Exam exam = new Exam(
                    examsResult.getLong("exam_id"),
                    examsResult.getString("exam_title")
            );
            exams.add(exam);
        }
        return exams;
    }
}
