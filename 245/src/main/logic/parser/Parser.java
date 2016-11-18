package main.logic.parser;

import main.logic.command.Command;

public abstract class Parser {

    public static Command parse(String... args) {
        if (args.length == 2) {
            return DecoderParser.getInstance().createCommand(args);
        } else {
            return EncoderParser.getInstance().createCommand(args);
        }
    }
    
    public abstract Command createCommand(String... args);
}
