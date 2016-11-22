package main;

import java.util.Scanner;

import main.logic.BombLogic;
import main.logic.Logic;
import main.logic.Result;

public class Challenge293 {
    
    private static Scanner sc = new Scanner(System.in);
    private static Logic logic = BombLogic.getInstance();
    
    public static void main(String[] args) {
        
        String wire = sc.nextLine();
        Result result = logic.execute(wire);
        while (result.isSuccessful()) {
            
        }
    }
}
