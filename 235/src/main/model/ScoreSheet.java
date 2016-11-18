package main.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScoreSheet {
    List<Frame> frames;
    
    public ScoreSheet(String args) {
        frames = Stream.of(args.trim().split("\\s+"))
                .map(Frame::new)
                .collect(Collectors.toList());
    }
}