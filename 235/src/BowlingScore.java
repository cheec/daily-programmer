
public class BowlingScore {
    
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
