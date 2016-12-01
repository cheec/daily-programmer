package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.logic.BombLogic;
import main.logic.Logic;
import main.logic.commands.Result;

public class Challenge293 {
    
    private static Scanner sc = new Scanner(System.in);
    private static Logic logic = BombLogic.getInstance();
    
    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        String line = sc.nextLine();
        while (!line.equalsIgnoreCase("q")) {
            input.add(line);
            line = sc.nextLine();
        }
        sc.close();
        Result result = logic.execute(input.toArray(new String[0]));
        System.out.println(result);
    }
}
