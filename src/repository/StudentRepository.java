package repository;

import model.Student;
import util.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class StudentRepository {
    private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
    private static final String GET_COUNT_OF_STUDENTS = "SELECT count(*) FROM students";

    private final Database database = new Database();

    public int getCountOfStudents() throws SQLException {
        ResultSet countResult = database.getSQLStatement().executeQuery(GET_COUNT_OF_STUDENTS);
        int count = 0;
        while (countResult.next()) {
            count = countResult.getInt("count");
        }
        return count;
    }

    public Set<Student> getAllStudents() throws SQLException {
        ResultSet studentsResult = database.getSQLStatement().executeQuery(GET_ALL_STUDENTS_QUERY);
        Set<Student> students = new HashSet<>();
        while (studentsResult.next()) {
            Student student = new Student(
                    studentsResult.getLong("student_id"),
                    studentsResult.getString("first_name"),
                    studentsResult.getString("last_name"),
                    studentsResult.getDate("dob"),
                    studentsResult.getString("national_code"),
                    studentsResult.getDouble("gpu")
            );
            students.add(student);
        }
        return students;
    }
}