import course.Course;
import service.SystemManager;
import service.SystemManagerImpl;
import service.UniversityService;
import service.UniversityServiceImpl;
import streams.Streams;
import student.Student;

import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {
        SystemManager sysManager = new SystemManagerImpl();

        List<Course> courses = sysManager.createCourse();
        List<Streams> streams = sysManager.addStreams();
        List<Student> students = sysManager.addStudent(courses, streams);

        UniversityService us = new UniversityServiceImpl();
        us.getStudentInformation(students.get(0));
        System.out.println("------------------------------------------------");
        us.getStudentInformation(students.get(1));
    }
}
