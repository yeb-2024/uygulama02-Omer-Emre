package org.example;

import javax.swing.*;
import java.awt.*;

public class kullaniciuyg {


    JFrame frame;
    JPanel panelust;
    JTextField kullaniciadi;

    public kullaniciuyg()
    {
        panelust = new JPanel();
        panelust.setLayout(new FlowLayout());
        JLabel labelust = new JLabel();

        kullaniciadi = new JTextField();
        kullaniciadi.setPreferredSize(new Dimension(200,40));

        panelust.add(labelust);
        panelust.add(kullaniciadi);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,2));

        frame.add(panelust);
        frame.setVisible(true);
    }
}
