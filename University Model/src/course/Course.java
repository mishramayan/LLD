package course;

import faculty.Faculty;

import java.util.List;

public class Course {
    private final int courseId;
    private final String courseName;
    private final List<Course> preRequisites;
    private final Faculty faculty;

    public Course(int courseId, String courseName, List<Course> preRequisites, Faculty faculty){
        this.courseId = courseId;
        this.courseName = courseName;
        this.preRequisites = preRequisites;
        this.faculty = faculty;
    }

    public int getCourseId(){
        return courseId;
    }

    public String getCourseName(int courseId){
        return courseName;
    }

    public List<Course> getPreRequisites(int courseId){
        return preRequisites;
    }

    public String getFacultyName(){ return faculty.getFacultyName(); }

    public void addPrerequisite(Course prerequisite) {
        this.preRequisites.add(prerequisite);
    }
}
