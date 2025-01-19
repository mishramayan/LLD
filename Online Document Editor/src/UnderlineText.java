class UnderlineText extends TextDecorator {
    public UnderlineText(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<u>" + text.render() + "</u>";
    }
}