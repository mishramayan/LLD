package student;

import course.Course;
import streams.Streams;

import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final long rollNumber;
    private final Streams stream;
    private final List<Course> courses;

    public Student(String fName, String lName, long rollNo, Streams stream, List<Course> courses){
        this.firstName = fName;
        this.lastName = lName;
        this.rollNumber = rollNo;
        this.stream = stream;
        this.courses = courses;
    }

    public long getRollNumber(){
        return rollNumber;
    }
    public String getName(long rollNumber){
        return firstName + " " + lastName;
    }

    public Streams getStream(long rollNumber){
        return stream;
    }

    public List<Course> getCourses(long rollNumber){
        return courses;
    }
}
