package main.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScoreSheet {
    
    private List<Frame> frames;
    private String sheet;
    
    public ScoreSheet(String args) {
        sheet = args == null ? "" : args.trim();
        frames = Stream.of(sheet.split("\\s+"))
                .map(Frame::new)
                .collect(Collectors.toList());
    }
    
    public List<Frame> getFrames() {
        return frames;
    }
    
    public String getFullSheet() {
        return sheet;
    }
    
    @Override
    public String toString() {
        return frames.toString();
    }
}