package main;

import java.util.Scanner;

import main.logic.Logic;
import main.logic.LogicManager;
import main.logic.command.CommandResult;

/**
 * reddit.com/r/dailyprogrammer/comments/3x3hqa/20151216_challenge_245_intermediate_ggggggg_gggg/
 */
public class Challenge245 {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Logic logic = LogicManager.getInstance();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            CommandResult result = logic.execute(sc.nextLine(), sc.nextLine());
            System.out.println(result);
        }
        
    }
}
