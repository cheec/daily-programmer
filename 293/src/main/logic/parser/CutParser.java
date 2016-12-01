package main.logic.parser;

import main.logic.commands.Command;
import main.logic.commands.CutWireCommand;

public class CutParser extends Parser {
    
    private static CutParser instance;
    
    private CutParser() {}
    
    @Override
    public Command createCommand(String... args) {
        return new CutWireCommand(args);
    }
    
    public static CutParser getInstance() {
        if (instance == null) {
            instance = new CutParser();
        }
        return instance;
    }
    
}
