import java.awt.*;

import javax.swing.*;
public class GameFrame extends JFrame {

    GamePanel panel;
    // class constructor - setup frame configuration and add game panel
    GameFrame(){
        panel=new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
