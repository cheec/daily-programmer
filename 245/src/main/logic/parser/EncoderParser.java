package main.logic.parser;

import main.logic.command.Command;
import main.logic.command.EncodeCommand;

public class EncoderParser extends Parser {
    
    private static EncoderParser instance;
    
    private EncoderParser() {}
    
    public static EncoderParser getInstance() {
        if (instance == null) {
            instance = new EncoderParser();
        }
        return instance;
    }
    
    @Override
    public Command createCommand(String... args) {
        return new EncodeCommand(args[0]);
    }
    
}
