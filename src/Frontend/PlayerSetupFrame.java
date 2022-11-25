package Frontend;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import java.util.*;

public class PlayerSetupFrame  {
    private JFrame playerSetup = new JFrame();

    public PlayerSetupFrame() {
        Container container = playerSetup.getContentPane();
        container.setLayout(new FlowLayout() );
        container.add(new JLabel("Welcome to Monopoly") );
        playerSetup.setSize(700,700); //location, size

        //Player One Set Up Square
        JTextField playerOneField = new JTextField("#");
        playerOneField.setPreferredSize(new Dimension(75, 25));
        container.add(playerOneField);

        playerSetup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        playerSetup.setVisible(true);
    }
}
