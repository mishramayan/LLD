package service;

import course.Course;
import streams.Streams;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagerImpl implements StudentManager{
    @Override
    public List<Student> addStudent(List<Course> courses, List<Streams> streams) {
        List<Course> st1Courses = new ArrayList<>(List.of(courses.get(0), courses.get(1), courses.get(2)));
        Student student1 = new Student("Mayan", "Mishra", 6624537, streams.get(0), st1Courses);

        List<Course> st2Courses = new ArrayList<>(List.of(courses.get(0), courses.get(3)));
        Student student2 = new Student("Neelesh", "Beura", 1554537, streams.get(1), st2Courses);

        return List.of(student1, student2);
    }

    @Override
    public Student getStudentInfo(List<Student> students, long rollNumber) {
        for(Student student : students){
            if(student.getRollNumber() == rollNumber){
                return student;
            }
        }
        System.out.println("Student with rollNumber: " + rollNumber + " NOT FOUND!");

        return null;
    }


}
