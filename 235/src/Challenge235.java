import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * reddit.com/r/dailyprogrammer/comments/3ntsni/20151007_challenge_235_intermediate_scoring_a/
 */
public class Challenge235 {
    
    private static final String MESSAGE_SCORE_SHEET = "Bowling sheet: %1$s";
    private static final String MESSAGE_SCORE_VALUE = "Total score: %1$d";
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            ScoreSheet score = new ScoreSheet(sc.nextLine().trim());
            System.out.println(String.format(MESSAGE_SCORE_SHEET, score.getScoreSheet()));
            System.out.println(String.format(MESSAGE_SCORE_VALUE, score.getScore()));
        }
    }
}

class ScoreSheet {
    
    private String fullScoreSheet;
    private List<Frame> frames;
    private int totalScore;
    
    public ScoreSheet(String scoreSheet) {
        this.fullScoreSheet = scoreSheet == null ? "" : scoreSheet;
        determineFrames();
        determineTotalScore();
    }
    
    public int getScore() {
        return this.totalScore;
    }
    
    public String getScoreSheet() {
        return fullScoreSheet;
    }
    
    private void determineTotalScore() {
        this.totalScore = frames.stream().collect(Collectors.summingInt(f -> f.getFrameScore()));
    }
    
    private void determineFrames() {
        frames = Stream.of(fullScoreSheet.split("\\s+"))
                .map(Frame::new)
                .collect(Collectors.toList());
    }
}

class Frame {
    
    private String frameText;
    private FrameType frameType;
    private int frameScore;
    
    private enum FrameType {
        LAST, STRIKE, STANDARD
    }
    
    public Frame(String frameValue) {
        this.frameText = frameValue == null ? "" : frameValue;
        determineFrameType();
        determineFrameScore();
    }
    
    public int getFrameScore() {
        return frameScore;
    }
    
    private void determineFrameScore() {
        
    }
    
    private void determineFrameType() {
        switch (frameText.length()) {
        case 1 :
            frameType = FrameType.STRIKE;
            return;
        case 2 :
            frameType = FrameType.STANDARD;
            return;
        case 3 :
            frameType = FrameType.LAST;
            return;
        default :
            return;
        }
    }
}
