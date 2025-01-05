public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(1).setAge(20).setName("Mayan").setSubjects().build();
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(20).setName("Esbdhaj").setFatherName("Father").setSubjects().build();
    }

}
