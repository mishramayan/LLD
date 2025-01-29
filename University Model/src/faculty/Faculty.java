package faculty;

public class Faculty {
    private final long facultyId;
    private final String facultyFName;
    private final String facultyLName;

    public Faculty(long facultyId, String facultyFName, String facultyLName){
        this.facultyId = facultyId;
        this.facultyFName = facultyFName;
        this.facultyLName = facultyLName;
    }

    public long getFacultyId(){
        return facultyId;
    }

    public String getFacultyName(){
        return facultyFName + " " + facultyLName;
    }
}
