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
            ScoreSheet scoreSheet = new ScoreSheet(sc.nextLine());
            System.out.println(String.format(MESSAGE_SCORE_SHEET, scoreSheet));
            System.out.println(String.format(MESSAGE_SCORE_VALUE, scoreSheet.getScore()));
        }
    }
}

class ScoreSheet {
    
    private String fullScoreSheet;
    private List<Frame> frames;
    private int totalScore;
    
    public ScoreSheet(String fullScoreSheet) {
        this.fullScoreSheet = fullScoreSheet == null ? "" : fullScoreSheet.trim();
        initFrames();
        calcTotalScore();
    }
    
    public int getScore() {
        return totalScore;
    }
    
    @Override
    public String toString() {
        return fullScoreSheet;
    }
    
    private void calcTotalScore() {
        totalScore = frames.stream().collect(Collectors.summingInt(f -> f.getFrameScore()));
    }
    
    private void initFrames() {
        frames = Stream.of(fullScoreSheet.split("\\s+"))
                .map(Frame::new)
                .collect(Collectors.toList());
    }
}

class Frame {
    
    private String frameText;
    private int frameScore;
    
    public Frame(String frameText) {
        this.frameText = frameText == null ? "" : frameText.trim();
        calcFrameScore();
    }
    
    public int getFrameScore() {
        return frameScore;
    }
    
    private void calcFrameScore() {
        
    }
}
