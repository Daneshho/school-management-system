package repository;

import model.Teacher;
import util.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class TeacherRepository {
    private static final String GET_ALL_TEACHERS_QUERY = "SELECT * FROM teachers";
    private static final String GET_COUNT_OF_TEACHERS = "SELECT COUNT(*) FROM teachers";

    private final Database database = new Database();

    public int getCountOfTeachers() throws SQLException {
        ResultSet countResult = database.getSQLStatement().executeQuery(GET_COUNT_OF_TEACHERS);
        int count = 0;
        while (countResult.next()) {
            count = countResult.getInt("count");
        }
        return count;
    }

    public Set<Teacher> getAllTeachers() throws SQLException {
        ResultSet teachersResult = database.getSQLStatement().executeQuery(GET_ALL_TEACHERS_QUERY);
        Set<Teacher> teachers = new HashSet<>();
        while (teachersResult.next()) {
            Teacher teacher = new Teacher(
                    teachersResult.getLong("teachers_id"),
                    teachersResult.getString("first_name"),
                    teachersResult.getString("last_name"),
                    teachersResult.getDate("dob"),
                    teachersResult.getString("national_code"),
                    teachersResult.getLong("course_id")
            );
            teachers.add(teacher);
        }
        return teachers;
    }
}
