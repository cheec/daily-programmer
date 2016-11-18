package main;

import java.util.Scanner;

import main.logic.BowlingScoreLogic;
import main.logic.Logic;

/*
 * reddit.com/r/dailyprogrammer/comments/3ntsni/20151007_challenge_235_intermediate_scoring_a/
 */
public class Challenge235 {
    private static final String MESSAGE_SCORE_SHEET = "Bowling sheet: %1$s";
    private static final String MESSAGE_SCORE_VALUE = "Total score: %1$d";
    
    private static final String TERMINATE = "q";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic logic = BowlingScoreLogic.getInstance();
        
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase(TERMINATE)) {
            int totalScore = logic.execute(input);
            System.out.println(String.format(MESSAGE_SCORE_SHEET, input));
            System.out.println(String.format(MESSAGE_SCORE_VALUE, totalScore));
            input = sc.nextLine();
        }
        sc.close();
    }
    
}
