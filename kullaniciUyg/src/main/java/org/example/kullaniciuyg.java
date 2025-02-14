package org.example;

import javax.swing.*;
import java.awt.*;

public class kullaniciuyg {


    JFrame frame = new JFrame();

    public kullaniciuyg()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,2));
        frame.setVisible(true);
    }
}
