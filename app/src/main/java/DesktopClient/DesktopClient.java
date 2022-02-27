package DesktopClient;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.*;
import static java.awt.BorderLayout.*;

import static DesktopClient.Constants.Frame.*;

public class DesktopClient {

    private static final JFrame frame = new JFrame("keyboard input");
    private static final JLabel emptyLabel = new JLabel("");

    private static final Keyboard board = new Keyboard();

    public static void main(String args[]) {
        config();

    };

    private static void config() {

        emptyLabel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_LENGTH));

        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, CENTER);
        frame.pack();
        frame.setVisible(true);

        frame.addKeyListener(board);

    }


    
}
