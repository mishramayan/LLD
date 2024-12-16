public class WordCountResult {
    private final int lines;
    private final int words;
    private final int characters;
    private final int distinctWords;

    public WordCountResult(int lines, int words, int characters, int distinctWords) {
        this.lines = lines;
        this.words = words;
        this.characters = characters;
        this.distinctWords = distinctWords;
    }

    public int getLines() {
        return lines;
    }
    public int getWords() {
        return words;
    }
    public int getCharacters() {
        return characters;
    }
    public int getDistinctWords() {
        return distinctWords;
    }

}
