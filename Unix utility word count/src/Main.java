import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String input = """
                This is test.
                   It is a simple test.
                 It has multiple lines.
                Some lines have, punctuations marks!
                """;

        WordCountResult result = wordCount(input);
        System.out.println("Lines : " + result.getLines());
        System.out.println("Words : " + result.getWords());
        System.out.println("Characters : " + result.getCharacters());
        System.out.println("Distinct words : " + result.getDistinctWords());
    }

    public static WordCountResult wordCount(String input) {
        int lines = 0, words = 0, characters = 0;
        HashSet<String> distinctWords = new HashSet<>();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            //Count characters
            characters++;

            //Check for line breaks
            if(ch == '\n'){
                lines++;
            }

            //Check for word boundaries
            if(Character.isLetterOrDigit(ch)){
                //Build word
                builder.append(ch);
            }else if(!builder.isEmpty()){
                //A word ends here
                String word = builder.toString().toLowerCase();
                words++;
                distinctWords.add(word); //add distinct word
                builder.setLength(0); //clear the buffer
            }
        }

        //Handle the last word
        if(!builder.isEmpty()){
            //A word ends here
            String word = builder.toString().toLowerCase();
            words++;
            distinctWords.add(word); //add distinct word
            builder.setLength(0); //clear the buffer
        }

        if(input.length() > 0 && input.charAt(input.length() - 1) != '\n'){
            lines++;
        }

        //return results
        return new WordCountResult(lines, words, characters, distinctWords.size());
    }
}