import java.util.Scanner;

public class Challenge235 {
    
    private static final String MESSAGE_SCORE_SHEET = "Bowling sheet: %1$s";
    private static final String MESSAGE_SCORE_VALUE = "Total score: %1$d";
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            BowlingScore score = new BowlingScore(sc.nextLine().trim());
            System.out.println(String.format(MESSAGE_SCORE_SHEET, score.getScoreSheet()));
            System.out.println(String.format(MESSAGE_SCORE_VALUE, score.getScore()));
        }
    }
}

class BowlingScore {
    
    private String scoreSheet;
    private int scoreValue;
    
    public BowlingScore(String scoreSheet) {
        this.scoreSheet = scoreSheet == null ? "" : scoreSheet;
        score();
    }
    
    private void score() {
        
    }
    
    public int getScore() {
        return this.scoreValue;
    }
    
    public String getScoreSheet() {
        return scoreSheet;
    }
}