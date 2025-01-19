public class Main {
    public static void main(String[] args) {
        CodeEditor editor = new CodeEditor("Java");

        String code = "public class Main { public static void main(String[] args) { System.out.println(\"Hello World\"); }}";

        Command checkSyntax = new CheckSyntaxCommand(code, editor.getChecker());
        checkSyntax.execute();

        Command switchToPython = new SwitchLanguageCommand(editor, "Python");
        switchToPython.execute();

        String pythonCode = "def get_list(): return [1, 2, 3]";
        Command checkPythonSyntax = new CheckSyntaxCommand(pythonCode, editor.getChecker());
        checkPythonSyntax.execute();

        Command grantPermission = new GrantPermissionCommand(editor, "UserB");
        grantPermission.execute();
        Command hasPermission = new CheckPermissionCommand(editor, "UserB"); hasPermission.execute();
        Command revokePermission = new RevokePermissionCommand(editor, "UserB");
        revokePermission.execute();
    }
}
