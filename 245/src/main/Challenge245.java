package main;

import java.util.Scanner;

import main.logic.Logic;
import main.logic.LogicManager;
import main.logic.command.CommandResult;

/**
 * reddit.com/r/dailyprogrammer/comments/3x3hqa/20151216_challenge_245_intermediate_ggggggg_gggg/
 */
public class Challenge245 {
    
    private static final Scanner SC = new Scanner(System.in);
    private static final Logic LOGIC = LogicManager.getInstance();
    
    private static final String DECODE_STATE_TOGGLE = "d";
    private static final String ENCODE_STATE_TOGGLE = "e";
    
    private static boolean isDecoding = true;
    
    public static void main(String[] args) {
        while (true) {
            displayState();
            String input = SC.nextLine();
            if (!isChangingState(input)) {
                CommandResult result = executeCommand(input);
                System.out.println(result);
            }
            System.out.println();
        }
        
    }
    
    private static boolean isChangingState(String input) {
        if (input.equalsIgnoreCase(DECODE_STATE_TOGGLE)) {
            isDecoding = true;
            return true;
        } else if (input.equalsIgnoreCase(ENCODE_STATE_TOGGLE)) {
            isDecoding = false;
            return true;
        }
        
        return false;
    }
    
    private static void displayState() {
        System.out.println(isDecoding ? "Decoding:" : "Encoding:");
    }
    
    private static CommandResult executeCommand(String input) {
        if (isDecoding) {
            return LOGIC.execute(input, SC.nextLine());
        } else {
            return LOGIC.execute(input);
        }
    }
    
}
