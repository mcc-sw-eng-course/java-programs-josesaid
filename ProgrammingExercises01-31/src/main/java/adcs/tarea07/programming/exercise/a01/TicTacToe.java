package adcs.tarea07.programming.exercise.a01;

public class TicTacToe {

    public static String turn = "X";

    public void execute(){
        String winner = null;
        new Context(new WelcomeMessageConsoleStrategy()).executeStrategy(null);
        while (winner == null) {
            Integer numInput = (int)new Context(new ValidationNumberStrategy()).executeStrategy(new Object());
            if(numInput == -1){
                continue;
            }
            winner = (String)new Context(new SetUserInputStrategy()).executeStrategy(new Object[]{ numInput});
        }
        new Context(new EndMessageConsoleStrategy()).executeStrategy(winner);
    }

}