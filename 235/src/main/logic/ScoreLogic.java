package main.logic;

import main.model.ScoreSheet;

public class ScoreLogic implements Logic {
    
    private static ScoreLogic instance;
    
    private ScoreSheet scoreSheet;
    private Parser parser = ScoreParser.getInstance();
    
    private ScoreLogic() {}
    
    @Override
    public int execute(String args) {
        scoreSheet = parser.parse(args);
        return calculateScore();
    }
    
    private int calculateScore() {
        
        return 0;
    }
    
    public static ScoreLogic getInstance() {
        if (instance == null) {
            instance = new ScoreLogic();
        }
        return instance;
    }
    
}
