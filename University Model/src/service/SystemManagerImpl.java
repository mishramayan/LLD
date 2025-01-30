package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.List;

public class SystemManagerImpl implements SystemManager {
    CourseManager courseManager = new CourseManagerImpl();
    List<Course> courses = courseManager.createCourse();

    StreamManager streamManager = new StreamMangerImpl();
    List<Streams> streams = streamManager.addStreams();

    StudentManager studentManager = new StudentManagerImpl();
    List<Student> students = studentManager.addStudent(courses, streams);


    @Override
    public Student getStudent(long rollNumber) {
        return studentManager.getStudentInfo(students, rollNumber);
    }

    @Override
    public List<Course> getCourseList() {
        return courses;
    }
}
