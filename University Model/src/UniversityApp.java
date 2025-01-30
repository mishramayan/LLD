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

        UniversityService us = new UniversityServiceImpl();
        us.getCourseList();
        System.out.println("------------------------------------------------");
        us.getStudentInformation(sysManager.getStudent(6624537));
        System.out.println("------------------------------------------------");
        us.getStudentInformation(sysManager.getStudent(1554537));
        System.out.println("------------------------------------------------");
        us.getStudentInformation(sysManager.getStudent(1000537));
    }
}
