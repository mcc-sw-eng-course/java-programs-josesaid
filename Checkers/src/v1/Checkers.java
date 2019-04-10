package v1;

import javax.swing.*;
import java.awt.*;

/**
 * This panel lets two users play checkers against each other.
 * Red always starts the game.  If a player can jump an opponent's
 * piece, then the player must jump.  When a player can make no more
 * moves, the game ends.
 *
 * The class has a main() routine that lets it be run as a stand-alone
 * application.  The application just opens a window that uses an object
 * of type Checkers as its content pane.
 */
public class Checkers extends JPanel {

    public void play(){
        JFrame window = new JFrame("Checkers");
        window.setContentPane(this);
        window.pack();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation( (screensize.width - window.getWidth())/2, (screensize.height - window.getHeight())/2 );
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setResizable(false);
        window.setVisible(true);
    }

    /**
     * The constructor creates the Board (which in turn creates and manages
     * the buttons and message label), adds all the components, and sets
     * the bounds of the components.  A null layout is used.  (This is
     * the only thing that is done in the main Checkers class.)
     */
    public Checkers() {
        setLayout(null);  // I will do the layout myself.
        setPreferredSize( new Dimension(350,250) );
        setBackground(new Color(0,150,0));  // Dark green background.

        Board board = new Board();
        add(board);
        add(board.newGameButton);
        add(board.resignButton);
        add(board.message);

        board.setBounds(20,20,164,164); // Note:  size MUST be 164-by-164 !
        board.newGameButton.setBounds(210, 60, 120, 30);
        board.resignButton.setBounds(210, 120, 120, 30);
        board.message.setBounds(0, 200, 350, 30);

    }

}
