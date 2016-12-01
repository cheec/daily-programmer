package main.model.wire;

public abstract class Wire {
    
    public abstract boolean isTrigger(Wire w);
    
    protected abstract void initTriggers();
    
    public abstract String getWireName();
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Wire)) {
            return false;
        }
        return this.getWireName().equalsIgnoreCase(((Wire) o).getWireName());
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWireName() == null) ? 0 : getWireName().hashCode());
        return result;
    }
}
