package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento extends JPanel implements ActionListener {

    JPanel jPanel;

    public Evento() {
        setLayout((LayoutManager)null);

        jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(Ventana.getWidth(), 200));
        jPanel.setBackground(Color.red);
        add(jPanel);
        jPanel.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
