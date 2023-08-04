package chap12;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel3 extends JPanel {
     public void paintCompinent(Graphics g) {
        Image image = new ImageIcon("developer.jpg").getImage();
        g.drawImage(image,3,4,this);
    }


}
