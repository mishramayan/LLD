class ColoredText extends TextDecorator {
    private String color;

    public ColoredText(Text text, String color) {
        super(text);
        this.color = color;
    }

    @Override
    public String render() {
        return "<span style=\"color:" + color + ";\">" + text.render() + "</span>";
    }
}