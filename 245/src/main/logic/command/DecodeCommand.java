package main.logic.command;

import java.util.HashMap;
import java.util.Optional;

public class DecodeCommand extends Command {
    
    private String toDecode;
    private HashMap<String, String> map;
    
    public DecodeCommand(String keysArgs, String toDecode) {
        this.toDecode = toDecode.trim();
        
        String[] splitKeyArgs = keysArgs.split("\\s+");
        map = new HashMap<String, String>();
        for (int i = 0; i < splitKeyArgs.length; i += 2) {
            map.put(splitKeyArgs[i + 1], splitKeyArgs[i]); // assuming valid input
        }
    }
    
    @Override
    public CommandResult execute() {
        StringBuilder decoded = new StringBuilder(this.toDecode);
        
        for (int i = 0; i < decoded.length(); i++) {
            Optional<String> toReplace = getKeyToReplace(decoded.toString(), i);
            if (toReplace.isPresent()) {
                String replacedCode = toReplace.get();
                decoded.replace(i, i + replacedCode.length(), map.get(replacedCode));
            }
        }
        
        return new CommandResult(decoded.toString());
    }
    
    private Optional<String> getKeyToReplace(String str, int i) {
        if (Character.toLowerCase(str.charAt(i)) != 'g') {
            return Optional.empty();
        }
        
        int min = Integer.MAX_VALUE;
        String keyToReplace = "";
        String target = str.substring(i);
        for (String code : map.keySet()) {
            int codeIdx = target.indexOf(code);
            if (codeIdx != -1 && codeIdx < min) {
                min = codeIdx;
                keyToReplace = code;
            }
        }
        return Optional.of(keyToReplace);
    }
    
}
