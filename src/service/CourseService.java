package service;

import model.Course;
import repository.CourseRepository;

import java.sql.SQLException;
import java.util.Set;

public class CourseService {

    private final CourseRepository courseRepository = new CourseRepository();

    public void printAllCourseList() {
        try {
            Set<Course> courses = this.courseRepository.getAllCourses();
            for (Course course : courses) {
                System.out.println(course);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printCountOfCourse() {
        try {
            int countOfCourse = this.courseRepository.getCountOfCourses();
            System.out.println("courses: ".concat(String.valueOf(countOfCourse)));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
