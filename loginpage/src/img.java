import java.awt.*;
import javax.swing.*;

class MyCanvas extends Canvas{
    MyCanvas(){
        JFrame f=new JFrame();

        JLabel label =new JLabel();
        label.setIcon(new ImageIcon("j.jpeg"));
        Dimension size=label.getPreferredSize();
        label.setBounds(50,100,300,300);
        f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}