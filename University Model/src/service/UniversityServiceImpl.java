package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.List;

public class UniversityServiceImpl implements UniversityService{

    @Override
    public void getStudentInformation(Student student) {
        long rollNumber = student.getRollNumber();
        String name = student.getName(rollNumber);
        Streams stream = student.getStream(rollNumber);
        List<Course> courses = student.getCourses(rollNumber);
        System.out.println("Name of the student: " + name);
        System.out.println("Stream of the student: " + stream.getStreamName());
        System.out.println("Courses taken by the student are: ");
        for(Course course : courses){
            int id = course.getCourseId();
            System.out.println(id + ": " + course.getCourseName(id));
            System.out.println("Pre-requisites for this course: ");
            List<Course> preReq = course.getPreRequisites(id);
            for(Course pre : preReq){
                int preId = pre.getCourseId();
                System.out.println(preId + ": " + pre.getCourseName(preId));
            }
        }
    }
}
