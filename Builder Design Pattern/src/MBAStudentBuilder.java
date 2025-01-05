import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<String>();
        subs.add("Economics");
        subs.add("Business Studies");
        subs.add("Opt Management");

        this.subjects = subs;
        return this;
    }
}
