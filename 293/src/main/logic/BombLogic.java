package main.logic;

import main.logic.commands.Command;
import main.logic.commands.Result;
import main.logic.parser.Parser;

public class BombLogic implements Logic {
    
    private static BombLogic instance;
    
    private BombLogic() {}
    
    public static BombLogic getInstance() {
        if (instance == null) {
            instance = new BombLogic();
        }
        return instance;
    }
    
    @Override
    public Result execute(String... args) {
        Command cmd = Parser.parse(args);
        return cmd.execute();
    }
    
}
