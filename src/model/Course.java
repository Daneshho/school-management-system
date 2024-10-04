package model;

import java.util.Objects;

public class Course {
    private long courseID;
    private String courseTitle;
    private String courseUnit;

    public Course() {
    }

    public Course(long courseID, String courseTitle, String courseUnit) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseUnit = courseUnit;
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(String courseUnit) {
        this.courseUnit = courseUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseID == course.courseID && Objects.equals(courseTitle, course.courseTitle) && Objects.equals(courseUnit, course.courseUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseID, courseTitle, courseUnit);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseUnit='" + courseUnit + '\'' +
                '}';
    }
}
