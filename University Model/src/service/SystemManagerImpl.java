package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class SystemManagerImpl implements SystemManager {
    @Override
    public List<Course> createCourse() {
        Course ds = new Course(1, "Data Structures", new ArrayList<>());
        Course algo = new Course(2, "Algorithms", List.of(ds));
        Course os = new Course(3, "Operating Systems", new ArrayList<>());
        Course networks = new Course(4, "Computer Networks", List.of(os));

        return List.of(ds, algo, os, networks);
    }

    @Override
    public List<Streams> addStreams() {
        Streams stream1 = new Streams(123, "Information Systems");
        Streams stream2 = new Streams(456, "Computer Science");

        return List.of(stream1, stream2);
    }

    @Override
    public List<Student> addStudent(List<Course> courses, List<Streams> streams) {
        List<Course> st1Courses = new ArrayList<>(List.of(courses.get(0), courses.get(1), courses.get(2)));
        Student student1 = new Student("Mayan", "Mishra", 6624537, streams.get(0), st1Courses);

        List<Course> st2Courses = new ArrayList<>(List.of(courses.get(0), courses.get(3)));
        Student student2 = new Student("Neelesh", "Beura", 1554537, streams.get(1), st2Courses);

        return List.of(student1, student2);
    }
}
