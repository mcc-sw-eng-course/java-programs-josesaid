package adcs.tarea07.programming.exercise.a01;

public class WelcomeMessageConsoleStrategy extends WriteConsoleString {

    @Override
    public Object execute(Object object) {
        new Context(new WriteConsoleString()).executeStrategy(new Object[]{"Welcome to 2 Player Tic Tac Toe.", "--------------------------------"});
        Board.getInstance().printBoard();
        new Context(new WriteConsoleString()).executeStrategy(new Object[]{"X's will play first. Enter a slot number to place X in:"});
        return true;
    }

}
