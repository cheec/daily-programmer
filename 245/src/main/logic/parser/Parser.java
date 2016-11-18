package main.logic.parser;

import main.logic.command.Command;

public abstract class Parser {
    
    public abstract Command parse(String... s);
}
