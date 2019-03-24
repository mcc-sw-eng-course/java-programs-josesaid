package adcs.tarea07.programming.exercise.a01;

public class Board {
    private String[] matrix;
    private static Board instance;

    private Board() {
        matrix = new String[9];
        populateEmptyBoard();
    }

    public static Board getInstance() {
        if (instance == null) {
            synchronized (Board.class) {
                if (instance == null) {
                    instance = new Board();
                }
            }
        }
        return instance;
    }

    private void populateEmptyBoard() {
        for (int index = 0; index < 9; index++) {
            matrix[index] = String.valueOf(index + 1);
        }
    }

    void printBoard() {
        String line01 = "/---|---|---\\";
        String line02 = "| " + getMatrix()[0] + " | " + getMatrix()[1] + " | " + getMatrix()[2] + " |";
        String line03 = "|-----------|";
        String line04 = "| " + getMatrix()[3] + " | " + getMatrix()[4] + " | " + getMatrix()[5] + " |";
        String line05 = "|-----------|";
        String line06 = "| " + getMatrix()[6] + " | " + getMatrix()[7] + " | " + getMatrix()[8] + " |";
        String line07 = "/---|---|---\\";
        new Context(new WriteConsoleString()).executeStrategy(new Object[]{line01, line02, line03, line04, line05, line06, line07});
    }

    public String[] getMatrix() {
        return matrix;
    }

}
