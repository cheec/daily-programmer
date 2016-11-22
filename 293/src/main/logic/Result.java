package main.logic;

import main.util.Messages;

public class Result {
    private String result;
    private boolean isSuccessful;
    
    public Result(String result) {
        this.result = result;
        this.isSuccessful = this.result.equalsIgnoreCase(Messages.MESSAGE_SUCCESS);
    }
    
    public boolean isSuccessful() {
        return isSuccessful;
    }
    
    @Override
    public String toString() {
        return result;
    }
}
