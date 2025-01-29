package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.List;

public class UniversityServiceImpl implements UniversityService {

    @Override
    public void getStudentInformation(Student student) {
        long rollNumber = student.getRollNumber();
        String name = student.getName(rollNumber);
        Streams stream = student.getStream(rollNumber);
        List<Course> courses = student.getCourses(rollNumber);

        printStudentDetails(name, stream);
        printCourses(courses);
    }

    private void printStudentDetails(String name, Streams stream) {
        System.out.println("Name of the student: " + name);
        System.out.println("Stream of the student: " + stream.getStreamName());
    }

    private void printCourses(List<Course> courses) {
        System.out.println("Courses taken by the student are:");
        for (Course course : courses) {
            printCourseDetails(course);
        }
    }

    private void printCourseDetails(Course course) {
        int id = course.getCourseId();
        System.out.println(id + ": " + course.getCourseName(id));
        printPrerequisites(course);
    }

    private void printPrerequisites(Course course) {
        System.out.println("Pre-requisites for this course:");
        List<Course> preReq = course.getPreRequisites(course.getCourseId());
        if (preReq.isEmpty()) {
            System.out.println("None");
        } else {
            for (Course pre : preReq) {
                int preId = pre.getCourseId();
                System.out.println(preId + ": " + pre.getCourseName(preId));
            }
        }
    }
}
