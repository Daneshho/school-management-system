package service;

import model.Teacher;
import repository.TeacherRepository;

import java.sql.SQLException;
import java.util.Set;

public class TeacherService {

    private final TeacherRepository teacherRepository = new TeacherRepository();

    public void printAllTeachersList() {
        try {
            Set<Teacher> teachers = teacherRepository.getAllTeachers();
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printCountOfTeachers() {
        try {
            int countOfTeacher = this.teacherRepository.getCountOfTeachers();
            System.out.println("teachers".concat(String.valueOf(countOfTeacher)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}