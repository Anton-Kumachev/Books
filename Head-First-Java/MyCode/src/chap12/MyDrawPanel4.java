package chap12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel4 extends JPanel {
    public void paintCompinent(Graphics g) {
        Image image = new ImageIcon("developer.jpg").getImage();
        g.drawImage(image,3,4,this);
    }
}
