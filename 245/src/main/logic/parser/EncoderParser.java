package main.logic.parser;

import main.logic.command.Command;

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
    public Command parse(String... args) {
        // TODO Auto-generated method stub
        return null;
    }
}
