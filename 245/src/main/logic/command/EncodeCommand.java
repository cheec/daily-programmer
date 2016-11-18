package main.logic.command;

public class EncodeCommand extends Command {
    
    private String toEncode;
    
    public EncodeCommand(String toEncode) {
        this.toEncode = toEncode == null ? "" : toEncode.trim();
    }
    
    @Override
    public CommandResult execute() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
