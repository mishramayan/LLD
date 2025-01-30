package service;

import streams.Streams;

import java.util.List;

public class StreamMangerImpl implements StreamManager{

    @Override
    public List<Streams> addStreams() {
        Streams stream1 = new Streams(123, "Information Systems");
        Streams stream2 = new Streams(456, "Computer Science");

        return List.of(stream1, stream2);
    }
}
