package main.model;

import java.util.ArrayList;
import java.util.List;

import main.util.ScoreUtil;

public class Frame {
    
    private List<Integer> ballScores = new ArrayList<Integer>();
    private String frame;
    
    public Frame(String args) {
        frame = args.trim();
        for (int i = 0; i < frame.length(); i++) {
            char score = frame.charAt(i);
            if (score == ScoreUtil.STRIKE) {
                ballScores.add(ScoreUtil.STRIKE_PTS);
            } else if (score == ScoreUtil.GUTTER) {
                ballScores.add(ScoreUtil.GUTTER_PTS);
            } else if (score == ScoreUtil.SPARE) { // assumes valid input i.e. spare always preceded by another ball.
                ballScores.add(ScoreUtil.STRIKE_PTS - ballScores.get(i - 1));
            } else { // normal ball i.e. raw score is a digit e.g. '5'
                ballScores.add(ScoreUtil.toInt(score));
            }
        }
    }
    
    public List<Integer> getBallScores() {
        return ballScores;
    }
    
    @Override
    public String toString() {
        return frame;
    }
}