package main.logic;

import main.logic.command.Command;
import main.logic.command.CommandResult;
import main.logic.parser.Parser;

public class LogicManager implements Logic {
    
    private static LogicManager instance;
    
    private LogicManager() {}
    
    @Override
    public CommandResult execute(String... args) {
        Command command = Parser.parse(args);
        return command.execute();
    }
    
    public static LogicManager getInstance() {
        if (instance == null) {
            instance = new LogicManager();
        }
        return instance;
    }
    
}
