package main.logic;

import java.util.List;

import main.model.Frame;
import main.model.ScoreSheet;
import main.util.ScoreUtil;

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
        int totalScore = 0;
        List<Frame> frames = scoreSheet.getFrames();
        int frameIdx = 0;
        int ballScoreIdx = 0;
        
        while (frameIdx < frames.size()) {
            Frame currFrame = frames.get(frameIdx);
            List<Integer> currBallScores = currFrame.getBallScores();
            
            totalScore += currBallScores.get(ballScoreIdx);
            
            if (frameIdx != frames.size() - 1) { // if not last frame, determine bonuses
                totalScore += determineBonus(frames, frameIdx, ballScoreIdx, currFrame, currBallScores);
            }
            
            if (ballScoreIdx == currBallScores.size() - 1) { // if last ball score of frame
                ballScoreIdx = 0;
                frameIdx++; // iterate to next frame
            } else { // else iterate along same frame
                ballScoreIdx++;
            }
        }
        
        return totalScore;
    }
    
    private int determineBonus(List<Frame> frames, int frameIdx, int ballScoreIdx, Frame currFrame,
            List<Integer> currBallScores) {
        char scoreChar = currFrame.toString().charAt(ballScoreIdx); // raw character of score at ballScoreIdx of currFrame
        if (scoreChar == ScoreUtil.STRIKE) {
            return calculateBonus(frames, frameIdx, currBallScores, ballScoreIdx, 2); // compute strike bonuses 2 ball scores ahead
        } else if (scoreChar == ScoreUtil.SPARE) {
            return calculateBonus(frames, frameIdx, currBallScores, ballScoreIdx, 1); // compute spare bonuses 1 ball score ahead
        }
        return 0;
    }
    
    private int calculateBonus(List<Frame> frames, int frameIdx, List<Integer> currBallScores, int ballScoreIdx,
            int step) {
        int fIdx = frameIdx;
        int bIdx = ballScoreIdx;
        int bonus = 0;
        List<Integer> cBS = currBallScores;
        while (step-- > 0) { // perform "step" times
            fIdx = bIdx == cBS.size() - 1 ? fIdx + 1 : fIdx; // if last ball score of frame, iterate to next frame, else do nothing
            bIdx = bIdx == cBS.size() - 1 ? 0 : bIdx + 1; // if last ball score of frame, reset start, else iterate normally
            cBS = frames.get(fIdx).getBallScores(); // updating ball score list reference
            bonus += cBS.get(bIdx); // adding bonus points
        }
        return bonus;
    }
    
    public static ScoreLogic getInstance() {
        if (instance == null) {
            instance = new ScoreLogic();
        }
        return instance;
    }
}
