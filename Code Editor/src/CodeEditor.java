import java.util.HashSet;
import java.util.Set;

public class CodeEditor {
    private String language;
    private SyntaxChecker checker;
    private final Set<String> collab = new HashSet<>();

    public CodeEditor(String language) {
        this.language = language;
        this.checker = SyntaxCheckFactory.getSyntaxChecker(language);
    }

    public void setLanguage(String newLanguage) {
        this.language = newLanguage;
        this.checker = SyntaxCheckFactory.getSyntaxChecker(newLanguage);
        System.out.println("Language set to " + newLanguage);
    }

    public SyntaxChecker getChecker() {
        return checker;
    }

    public void grantPermission(String collaborator){
        collab.add(collaborator);
        System.out.println("Granted " + collaborator);
    }

    public void revokePermission(String collaborator){
        collab.remove(collaborator);
        System.out.println("Revoked " + collaborator);
    }

    public void hasPermission(String collaborator){
         if(collab.contains(collaborator)){
             System.out.println(collaborator + " has permission");
         }else {
             System.out.println(collaborator + " does not have permission");
         }
    }
}
