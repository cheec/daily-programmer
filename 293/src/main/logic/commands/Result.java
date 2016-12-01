package main.logic.commands;

public class Result {
    private String result;
    
    public Result(String result) {
        this.result = result.trim();
    }
    
    @Override
    public String toString() {
        return result;
    }
}
