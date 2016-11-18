package main.logic;

import main.logic.command.Command;
import main.logic.command.CommandResult;
import main.logic.parser.DecoderParser;
import main.logic.parser.EncoderParser;
import main.logic.parser.Parser;

public class LogicManager implements Logic {
    
    private static LogicManager instance;
    
    private Parser encoderParser = EncoderParser.getInstance();
    private Parser decoderParser = DecoderParser.getInstance();
    
    private LogicManager() {}
    
    @Override
    public CommandResult execute(String... args) {
        if (args.length == 2) {
            Command command = decoderParser.parse(args[0], args[1]);
            return command.execute();
        }
        return null;
    }
    
    public static LogicManager getInstance() {
        if (instance == null) {
            instance = new LogicManager();
        }
        return instance;
    }
    
}
