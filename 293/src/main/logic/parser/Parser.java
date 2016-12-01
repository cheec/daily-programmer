package main.logic.parser;

import main.logic.commands.Command;

public abstract class Parser {
    
    public static Command parse(String... args) {
        return CutParser.getInstance().createCommand(args);
    }
    
    public abstract Command createCommand(String... args);
}
