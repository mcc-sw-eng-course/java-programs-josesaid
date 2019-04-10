package v1;

public class CheckersMove {
    int fromRow, fromCol;  // Position of piece to be moved.
    int toRow, toCol;      // Square it is to move to.

    CheckersMove(int r1, int c1, int r2, int c2) {
        // Constructor.  Just set the values of the instance variables.
        fromRow = r1;
        fromCol = c1;
        toRow = r2;
        toCol = c2;
    }
    boolean isJump() {
        // Test whether this move is a jump.  It is assumed that
        // the move is legal.  In a jump, the piece moves two
        // rows.  (In a regular move, it only moves one row.)
        return (fromRow - toRow == 2 || fromRow - toRow == -2);
    }
}