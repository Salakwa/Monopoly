package Frontend;

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame playerView = new JFrame("Monopoly");

        JMenuBar gameMB = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem loadFile = new JMenuItem("Load...");
        JMenuItem saveFile = new JMenuItem("Save...");
        JMenu newGame = new JMenu("New Game");
        JMenu help = new JMenu("Help");
        gameMB.add(file);
        gameMB.add(newGame);
        gameMB.add(help);

        playerView.setJMenuBar(gameMB);
        playerView.setSize(700, 700);
        playerView.setLocationRelativeTo(null);
        playerView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        playerView.setVisible(true);
    }

} 