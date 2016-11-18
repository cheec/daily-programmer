package main.logic;

import main.model.ScoreSheet;

public class BowlingScoreLogic implements Logic {
    
    private static BowlingScoreLogic instance;
    
    private Parser parser = BowlingScoreParser.getInstance();
    
    private BowlingScoreLogic() {}
    
    @Override
    public int execute(String args) {
        ScoreSheet scoreSheet = parser.parse(args);
        return calculateScore(scoreSheet);
    }
    
    private int calculateScore(ScoreSheet scoreSheet) {
        return 0;
    }
    
    public static BowlingScoreLogic getInstance() {
        if (instance == null) {
            instance = new BowlingScoreLogic();
        }
        return instance;
    }
    
}
