package main.logic.parser;

import main.logic.command.Command;
import main.logic.command.DecodeCommand;

public class DecoderParser extends Parser {
    
    private static DecoderParser instance;
    
    private DecoderParser() {}
    
    public static DecoderParser getInstance() {
        if (instance == null) {
            instance = new DecoderParser();
        }
        return instance;
    }
    
    @Override
    public Command createCommand(String... args) {
        return new DecodeCommand(args[0], args[1]);
    }
    
}
