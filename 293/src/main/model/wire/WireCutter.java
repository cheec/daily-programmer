package main.model.wire;

public class WireCutter implements WireOperator {
    
    @Override
    public boolean isOperable(Wire a, Wire b) {
        return !a.isTrigger(b);
    }
    
}
