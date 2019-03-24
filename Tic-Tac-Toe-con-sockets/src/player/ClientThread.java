package player;

import java.awt.Image;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClientThread implements Runnable{

    private Socket socketClient;
    private DataOutputStream out;
    private DataInputStream in;

    private int puerto = 2027;

    private String host = "localhost";

    private String message;
    private Main frame;
    private JButton[][] buttons;

    private Image X;
    private Image O;
    
    private boolean turno;

    public ClientThread(Main frame){
        try {
            this.frame = frame;
            X = ImageIO.read(getClass().getResource("X.png"));
            O = ImageIO.read(getClass().getResource("O.png"));

            socketClient = new Socket(host,puerto);
            in = new DataInputStream(socketClient.getInputStream());
            out = new DataOutputStream(socketClient.getOutputStream());

            buttons = this.frame.getButtons();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try{
            message =  in.readUTF();
            String split[] = message.split(";");
            frame.changeText(split[0]);
            String XO = split[0].split(" ")[1];
            turno = Boolean.valueOf(split[1]);

            while(true){
                message = in.readUTF();
                /*
                    message[0] : represents X o O
                    message[1] : represents dashboard row
                    message[2] : represents dashboard column
                    message[3] : represents the state of the game [lost, won, draw]
                */
                
                String[] messages = message.split(";");
                int xo = Integer.parseInt(messages[0]);
                int row = Integer.parseInt(messages[1]);
                int column = Integer.parseInt(messages[2]);

                if(xo == 1)
                    buttons[row][column].setIcon(new ImageIcon(X));
                else
                    buttons[row][column].setIcon(new ImageIcon(O));
                /*
                Blockeamos el clik al boton que se jugó, para que no se pueda volver a enviar la misma jugada y pasamos el turno
                */
                buttons[row][column].removeActionListener(buttons[row][column].getActionListeners()[0]);
                turno = !turno;
                
                /*
                Dependiendo del mensajes[3] que nos dice el estado del juego, mostramos el message
                */
                if(XO.equals(messages[3])){
                    JOptionPane.showMessageDialog(frame, "GANASTEEEEEE!");
                    new Main().setVisible(true);
                    frame.dispose();
                }else  if("EMPATE".equals(messages[3])){
                    JOptionPane.showMessageDialog(frame, "EMPATE!");
                    new Main().setVisible(true);
                    frame.dispose();
                }
                else  if(!"NADIE".equals(messages[3]) && !messages[3].equals(messages[0])){
                    JOptionPane.showMessageDialog(frame, "PERDISTE BUUUUU!");
                    new Main().setVisible(true);
                    frame.dispose();
                }
                
                
              
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Funcion sirve para enviar la jugada al server
    public void sendTurn(int row, int column){
        /*
        Comprobamos que sea nuestro turno para jugar, si no es devolmemos un message
        Si es el turno entonces mandamos un message al server con los datos de la jugada que hicimos
        */
        try {
            if(turno){
                String  datos = "";
                datos += row + ";";
                datos += column + ";";
                out.writeUTF(datos);
            }
            else{
                JOptionPane.showMessageDialog(frame, "Espera tu turno");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
