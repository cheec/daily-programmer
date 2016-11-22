package main.logic;

public class BombLogic implements Logic {
    
    private static BombLogic instance;
    
    private BombLogic() {}
    
    public static BombLogic getInstance() {
        if (instance == null) {
            instance = new BombLogic();
        }
        return instance;
    }
    
    @Override
    public Result execute(String args) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
