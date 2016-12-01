package main.model.wire;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BlackWire extends Wire {
    
    public static final String WIRE_NAME = "black";
    
    private Set<Wire> triggers;
    
    @Override
    protected void initTriggers() {
        triggers = new HashSet<Wire>(Arrays.asList(new WhiteWire(), new OrangeWire(), new GreenWire()));
    }
    
    @Override
    public String getWireName() {
        return WIRE_NAME;
    }
    
    @Override
    public boolean isTrigger(Wire w) {
        if (triggers == null) {
            initTriggers();
        }
        return triggers.contains(w);
    }
    
}
