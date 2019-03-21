package adcs.tarea07.programming.exercise.a01;

import static adcs.tarea07.programming.exercise.a01.TicTacToe.turn;

public class SetUserInputStrategy implements Strategy {

    @Override
    public Object execute(Object object) {
        Board board = Board.getInstance();
        int numInput = 0;
        String winner = new String();

        if(object instanceof Object[]){
            Object[] data = (Object[])object;
            numInput = (int)data[0];
        }

        if (board.getMatrix()[numInput-1].equals(String.valueOf(numInput))) {
            board.getMatrix()[numInput-1] = turn;
            if (turn.equals("X")) {
                turn = "O";
            } else {
                turn = "X";
            }

            board.printBoard();

            winner = new Winner().check(board, turn);
        } else {
            System.out.println("Slot already taken; re-enter slot number:");
            winner = null;
        }
        return winner;
    }

}
