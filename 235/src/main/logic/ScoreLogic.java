package main.logic;

import main.model.ScoreSheet;

public class ScoreLogic implements Logic {
    
    private static ScoreLogic instance;
    
    private Parser parser = ScoreParser.getInstance();
    
    private ScoreLogic() {}
    
    @Override
    public int execute(String args) {
        ScoreSheet scoreSheet = parser.parse(args);
        return calculateScore(scoreSheet);
    }
    
    private int calculateScore(ScoreSheet scoreSheet) {
        return 0;
    }
    
    public static ScoreLogic getInstance() {
        if (instance == null) {
            instance = new ScoreLogic();
        }
        return instance;
    }
    
}
