package main.logic.parser;

import main.logic.command.Command;

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
        // TODO Auto-generated method stub
        return null;
    }
    
}
