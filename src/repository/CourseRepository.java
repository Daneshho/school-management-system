package repository;

import model.Course;
import util.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CourseRepository {
    private static final String GET_ALL_COURSES_QUERY = "SELECT * FROM courses";
    private static final String GET_COUNT_OF_COURSES = "SELECT count(*) FROM courses";

    private final Database database = new Database();

    public int getCountOfCourses() throws SQLException {
        ResultSet countResult = database.getSQLStatement().executeQuery(GET_COUNT_OF_COURSES);
        int count = 0;
        while (countResult.next()) {
            count = countResult.getInt("count");
        }
        return count;
    }

    public Set<Course> getAllCourses() throws SQLException {
        ResultSet coursesResult = database.getSQLStatement().executeQuery(GET_ALL_COURSES_QUERY);
        Set<Course> courses = new HashSet<>();
        while (coursesResult.next()) {
            Course course = new Course(
                    coursesResult.getLong("course_id"),
                    coursesResult.getString("course_title"),
                    coursesResult.getString("course_unit")
            );
            courses.add(course);
        }
        return courses;
    }
}
