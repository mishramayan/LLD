import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<String>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer Architecture");

        this.subjects = subs;
        return this;
    }

}
