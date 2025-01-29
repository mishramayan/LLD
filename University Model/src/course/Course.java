package course;

import java.util.List;

public class Course {
    private final int courseId;
    private final String courseName;
    private final List<Course> preRequisites;

    public Course(int courseId, String courseName, List<Course> preRequisites){
        this.courseId = courseId;
        this.courseName = courseName;
        this.preRequisites = preRequisites;
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

    public void addPrerequisite(Course prerequisite) {
        this.preRequisites.add(prerequisite);
    }
}
