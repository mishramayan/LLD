public class PlainText implements Text{
    private final String content;

    public PlainText(String content){
        this.content = content;
    }

    @Override
    public String render() {
        return content;
    }
}
