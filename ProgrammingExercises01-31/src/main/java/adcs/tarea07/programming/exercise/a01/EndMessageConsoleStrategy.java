package adcs.tarea07.programming.exercise.a01;

public class EndMessageConsoleStrategy extends WriteConsoleString {

    @Override
    public Object execute(Object object) {
        String winner = new String();
        if(object instanceof String){
            winner = object.toString();
        }
        if (winner.equalsIgnoreCase("draw")) {
            new Context(new WriteConsoleString()).executeStrategy(new Object[]{"It's a draw! Thanks for playing."});
        } else {
            new Context(new WriteConsoleString()).executeStrategy(new Object[]{"Congratulations! " + winner + "'s have won! Thanks for playing."});
        }
        return true;
    }

}
