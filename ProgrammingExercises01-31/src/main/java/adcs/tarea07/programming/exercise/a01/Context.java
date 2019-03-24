package adcs.tarea07.programming.exercise.a01;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public Object executeStrategy(Object object) {
        return strategy.execute(object);
    }
}
