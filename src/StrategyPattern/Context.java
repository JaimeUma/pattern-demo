package StrategyPattern;

public class Context {

    IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
    	// Ejecutar instrucciones ....
    	
    	// Ejecutar instrucciones dependientes de la estrategia
        strategy.execute();
        
        // Ejecutar más instrucciones
        
    }
}
