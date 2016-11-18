package main.model;

import java.util.ArrayList;
import java.util.List;

import main.util.ScoreUtil;

public class Frame {
    
    List<Integer> ballScores = new ArrayList<Integer>();
    
    public Frame(String args) {
        for (int i = 0; i < args.length(); i++) {
            char score = args.charAt(i);
            if (score == ScoreUtil.STRIKE) {
                ballScores.add(ScoreUtil.STRIKE_PTS);
            } else if (score == ScoreUtil.GUTTER) {
                ballScores.add(ScoreUtil.GUTTER_PTS);
            } else if (score == ScoreUtil.SPARE) { // assumes valid input i.e. spare always preceded by another ball.
                ballScores.add(ScoreUtil.STRIKE_PTS - ScoreUtil.toInt(args.charAt(i - 1)));
            } else { // normal ball
                ballScores.add(ScoreUtil.toInt(score));
            }
        }
    }
}