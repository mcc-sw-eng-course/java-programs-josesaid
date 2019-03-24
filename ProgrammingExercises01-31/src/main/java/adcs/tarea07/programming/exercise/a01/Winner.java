package adcs.tarea07.programming.exercise.a01;

import java.util.Arrays;

public class Winner {

    public String check(Board board, String turn) {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board.getMatrix()[0] + board.getMatrix()[1] + board.getMatrix()[2];
                    break;
                case 1:
                    line = board.getMatrix()[3] + board.getMatrix()[4] + board.getMatrix()[5];
                    break;
                case 2:
                    line = board.getMatrix()[6] + board.getMatrix()[7] + board.getMatrix()[8];
                    break;
                case 3:
                    line = board.getMatrix()[0] + board.getMatrix()[3] + board.getMatrix()[6];
                    break;
                case 4:
                    line = board.getMatrix()[1] + board.getMatrix()[4] + board.getMatrix()[7];
                    break;
                case 5:
                    line = board.getMatrix()[2] + board.getMatrix()[5] + board.getMatrix()[8];
                    break;
                case 6:
                    line = board.getMatrix()[0] + board.getMatrix()[4] + board.getMatrix()[8];
                    break;
                case 7:
                    line = board.getMatrix()[2] + board.getMatrix()[4] + board.getMatrix()[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board.getMatrix()).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) return "draw";
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

}
