package main.logic.command;

public class CommandResult {
    
    private String result;
    
    public CommandResult(String result) {
        this.result = result == null ? "" : result;
    }
    
    @Override
    public String toString() {
        return result;
    }
}
