package model;

import java.util.Date;
import java.util.Objects;

public class Teacher {
    private long teacherID;
    private String teacherFirstName;
    private String teacherLastName;
    private Date teacherBirthDate;
    private String nationalCode;
    private long courseID;

    public Teacher(long teacherID, String teacherFirstName, String teacherLastName, Date teacherBirthDate, String nationalCode, long courseID) {
        this.teacherID = teacherID;
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.teacherBirthDate = teacherBirthDate;
        this.nationalCode = nationalCode;
        this.courseID = courseID;
    }

    public Teacher() {
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public Date getTeacherBirthDate() {
        return teacherBirthDate;
    }

    public void setTeacherBirthDate(Date teacherBirthDate) {
        this.teacherBirthDate = teacherBirthDate;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherID == teacher.teacherID && courseID == teacher.courseID && Objects.equals(teacherFirstName, teacher.teacherFirstName) && Objects.equals(teacherLastName, teacher.teacherLastName) && Objects.equals(teacherBirthDate, teacher.teacherBirthDate) && Objects.equals(nationalCode, teacher.nationalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherID, teacherFirstName, teacherLastName, teacherBirthDate, nationalCode, courseID);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", teacherFirstName='" + teacherFirstName + '\'' +
                ", teacherLastName='" + teacherLastName + '\'' +
                ", teacherBirthDate=" + teacherBirthDate +
                ", nationalCode='" + nationalCode + '\'' +
                ", courseID=" + courseID +
                '}';
    }
}
