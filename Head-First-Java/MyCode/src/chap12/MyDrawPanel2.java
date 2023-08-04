package chap12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel2 extends JPanel {
    public void paintCompinent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20,50, 100,100);
    }
}
