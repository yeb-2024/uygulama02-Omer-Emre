package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kullaniciuyg implements ActionListener {


    JFrame frame;
    JPanel panelust;
    JPanel panelalt;
    JButton buton;
    JTextField kullaniciadi;
    JTextField şifre;

    public kullaniciuyg()
    {
        panelust = new JPanel();
        panelust.setLayout(new FlowLayout());
        JLabel labelust = new JLabel("Kullanıcı Adı :");

        kullaniciadi = new JTextField();
        kullaniciadi.setPreferredSize(new Dimension(300,40));

        şifre = new JTextField();
        şifre.setPreferredSize(new Dimension(300,40));

        buton = new JButton("Giriş Yap");
        buton.addActionListener(this);

        JLabel labelalt = new JLabel("Şifre :");

        panelalt = new JPanel();
        panelalt.setPreferredSize(new Dimension(300,40));

        panelust.add(labelust);
        panelust.add(kullaniciadi);

        panelalt.add(labelalt);
        panelalt.add(şifre);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,2));

        frame.add(panelust);
        frame.add(panelalt);
        frame.add(buton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buton)
        {
           String kullaniciadi = this.kullaniciadi.getText().trim();
            String şifre = this.şifre.getText().trim();

            if(kullaniciadi.isEmpty() || şifre.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Lütten tüm alanları doldurun", "Hata",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
