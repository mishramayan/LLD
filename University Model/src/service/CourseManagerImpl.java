package service;

import course.Course;
import faculty.Faculty;

import java.util.ArrayList;
import java.util.List;

public class CourseManagerImpl implements CourseManager{
    public List<Faculty> addFaculty() {
        Faculty faculty1 = new Faculty(325646, "Kal", "Bugrara");
        Faculty faculty2 = new Faculty(984625, "Jagadish", "Ramaswamy");

        return List.of(faculty1, faculty2);
    }

    @Override
    public List<Course> createCourse() {
        List<Faculty> faculties = addFaculty();;

        Course ds = new Course(1, "Data Structures", new ArrayList<>(), faculties.get(0));
        Course algo = new Course(2, "Algorithms", List.of(ds), faculties.get(1));
        Course os = new Course(3, "Operating Systems", new ArrayList<>(), faculties.get(1));
        Course networks = new Course(4, "Computer Networks", List.of(os), faculties.get(1));

        return List.of(ds, algo, os, networks);
    }
}
