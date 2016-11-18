package main.logic;

import main.model.ScoreSheet;

public class BowlingScoreParser implements Parser {
    
    private static BowlingScoreParser instance;
    
    private BowlingScoreParser() {}
    
    @Override
    public ScoreSheet parse(String args) {
        return new ScoreSheet(args);
    }
    
    public static BowlingScoreParser getInstance() {
        if (instance == null) {
            instance = new BowlingScoreParser();
        }
        return instance;
    }
}
