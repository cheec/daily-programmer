package main.logic;

import main.model.ScoreSheet;

public class ScoreParser implements Parser {
    
    private static ScoreParser instance;
    
    private ScoreParser() {}
    
    @Override
    public ScoreSheet parse(String args) {
        return new ScoreSheet(args);
    }
    
    public static ScoreParser getInstance() {
        if (instance == null) {
            instance = new ScoreParser();
        }
        return instance;
    }
}
