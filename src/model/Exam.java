package model;

import java.util.Objects;

public class Exam {
    private long examID;
    private String examTitle;

    public Exam() {
    }

    public Exam(long examID, String examTitle) {
        this.examID = examID;
        this.examTitle = examTitle;
    }

    public long getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return examID == exam.examID && Objects.equals(examTitle, exam.examTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examID, examTitle);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", examTitle='" + examTitle + '\'' +
                '}';
    }
}
