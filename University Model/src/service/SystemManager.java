package service;

import course.Course;
import student.Student;

import java.util.List;

public interface SystemManager {
    public Student getStudent(long rollNumber);
    public List<Course> getCourseList();
}
