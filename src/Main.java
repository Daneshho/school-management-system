import service.CourseService;
import service.ExamService;
import service.StudentService;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        CourseService courseService = new CourseService();
        ExamService examService = new ExamService();

        studentService.printCountOfStudents();
        studentService.printAllStudentsList();

        teacherService.printCountOfTeachers();
        teacherService.printAllTeachersList();

        courseService.printCountOfCourse();
        courseService.printAllCourseList();

        examService.printCountOfExams();
        examService.printAllExamsList();
    }
}