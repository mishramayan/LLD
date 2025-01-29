package streams;

public class Streams {
    private final int streamId;
    private final String streamName;

    public Streams(int streamId, String streamName){
        this.streamId = streamId;
        this.streamName = streamName;
    }

    public int getStreamId(){
        return streamId;
    }

    public String getStreamName(){
        return streamName;
    }
}
