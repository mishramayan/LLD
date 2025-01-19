public interface Command {
    void execute();
}

class CheckSyntaxCommand implements Command {
    private String code;
    private SyntaxChecker checker;

    public CheckSyntaxCommand(String code, SyntaxChecker checker) {
        this.code = code;
        this.checker = checker;
    }


    @Override
    public void execute() {
        boolean isValid = checker.checkSyntax(code);
        System.out.println("Syntax is " + (isValid ? "valid" : "invalid") + " for selected language.");
    }
}

class SwitchLanguageCommand implements Command {
    private CodeEditor editor;
    private String newLanguage;

    public SwitchLanguageCommand(CodeEditor editor, String newLanguage){
        this.editor = editor;
        this.newLanguage = newLanguage;
    }

    @Override
    public void execute() {
        editor.setLanguage(newLanguage);
    }
}

class GrantPermissionCommand implements Command {
    private CodeEditor editor;
    private String collaborator;

    public GrantPermissionCommand(CodeEditor editor, String collaborator) {
        this.editor = editor;
        this.collaborator = collaborator;
    }

    @Override
    public void execute() {
        editor.grantPermission(collaborator);
    }
}

class RevokePermissionCommand implements Command {
    private CodeEditor editor;
    private String collaborator;

    public RevokePermissionCommand(CodeEditor editor, String collaborator) {
        this.editor = editor;
        this.collaborator = collaborator;
    }

    @Override
    public void execute() {
        editor.revokePermission(collaborator);
    }
}

class CheckPermissionCommand implements Command {
    private CodeEditor editor;
    private String collaborator;

    public CheckPermissionCommand(CodeEditor editor, String collaborator) {
        this.editor = editor;
        this.collaborator = collaborator;
    }

    @Override
    public void execute() {
        editor.hasPermission(collaborator);
    }
}

