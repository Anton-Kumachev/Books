package chap13;

import javax.swing.*;
import java.awt.*;

public class Buttons {
    public static void main(String[] args) {
        Buttons gui = new Buttons();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
