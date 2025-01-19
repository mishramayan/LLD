public class DocumentEditor {
    public static void main(String[] args) {
        // Step 1: Create a base text
        Text plainText = new PlainText("Hello, World!");

        // Step 2: Apply decorations dynamically
        Text boldText = new BoldText(plainText);
        Text italicText = new ItalicText(boldText);
        Text coloredText = new ColoredText(italicText, "#FF0000"); // Red Color

        // Render the final text
        System.out.println(coloredText.render());

        // Another Example: Underlined and Bold
        Text underlineText = new UnderlineText(new BoldText(new PlainText("Decorated Text")));
        System.out.println(underlineText.render());
    }
}