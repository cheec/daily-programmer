package main;

import java.util.Scanner;

import main.logic.ScoreLogic;
import main.logic.Logic;

/*
 * reddit.com/r/dailyprogrammer/comments/3ntsni/20151007_challenge_235_intermediate_scoring_a/
 */
public class Challenge235 {
    
    private static final String MESSAGE_SCORE_RESULT = 
            "Bowling sheet: %1$s\n" 
            + "Total score: %2$d";
    
    private static final String TERMINATE = "q";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic logic = ScoreLogic.getInstance();
        
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase(TERMINATE)) {
            int totalScore = logic.execute(input);
            System.out.println(String.format(MESSAGE_SCORE_RESULT, input, totalScore));
            input = sc.nextLine();
        }
        sc.close();
    }
    
}
