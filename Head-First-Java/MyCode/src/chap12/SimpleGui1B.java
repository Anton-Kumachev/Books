package chap12;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();


    }
        public void go () {
            JFrame frame = new JFrame();
            JButton button = new JButton("Push");

            button.addActionListener(this);

            frame.getContentPane().add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setVisible(true);
        }

    public void actionPerformed(ActionEvent event) {
            button.setText("GOOD!");
    }
}
