package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.List;

public interface StudentManager {
    public List<Student> addStudent(List<Course> courses, List<Streams> streams);
    public Student getStudentInfo(List<Student> students, long rollNumber);
}
