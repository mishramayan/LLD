public interface SyntaxChecker {
    boolean checkSyntax(String code);
}

class JavaSyntaxChecker implements SyntaxChecker {
    @Override
    public boolean checkSyntax(String code) {
        int openBraces = code.length() - code.replace("{", "").length();
        int closeBraces = code.length() - code.replace("}", "").length();

        return openBraces == closeBraces;
    }
}

class PythonSyntaxChecker implements SyntaxChecker {
    @Override
    public boolean checkSyntax(String code) {
        int openSqBracket = code.length() - code.replace("[", "").length();
        int closeSqBracket = code.length() - code.replace("]", "").length();

        return openSqBracket == closeSqBracket;
    }
}

class SyntaxCheckFactory{
    public static SyntaxChecker getSyntaxChecker(String language){
        switch(language.toLowerCase()){
            case "java":
                return new JavaSyntaxChecker();
            case "python":
                return new PythonSyntaxChecker();
            default:
                throw new IllegalArgumentException("Unsupported language: " + language);
        }
    }
}