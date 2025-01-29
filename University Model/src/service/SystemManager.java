package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.List;

public interface SystemManager {
    public List<Course> createCourse();
    public List<Streams> addStreams();
    public List<Student> addStudent(List<Course> courses, List<Streams> streams);
}
