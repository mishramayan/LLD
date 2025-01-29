import course.Course;
import service.UniversityService;
import service.UniversityServiceImpl;
import streams.Streams;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {
        Course ds = new Course(1, "Data Structures", new ArrayList<>());
        Course algo = new Course(2, "Algorithms", List.of(ds));
        Course os = new Course(3, "Operating Systems", List.of(algo));
        Course networks = new Course(4, "Computer Networks", List.of(os));

        Streams stream1 = new Streams(123, "Information Systems");
        Streams stream2 = new Streams(456, "Computer Science");

        List<Course> st1 = new ArrayList<>();
        st1.add(ds);
        st1.add(algo);
        st1.add(os);
        Student student1 = new Student("Mayan", "Mishra", 6624537, stream1, st1);

        List<Course> st2 = new ArrayList<>();
        st2.add(ds);
        st2.add(networks);
        Student student2 = new Student("Neelesh", "Beura", 1554537, stream2, st2);

        UniversityService us = new UniversityServiceImpl();
        us.getStudentInformation(student1);
        System.out.println("------------------------------------------------");
        us.getStudentInformation(student2);
    }
}
