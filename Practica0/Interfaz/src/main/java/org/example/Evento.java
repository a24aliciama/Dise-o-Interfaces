package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento extends JPanel implements ActionListener {

    private JButton JBjugar;

    public Evento() {
        this.setLayout((LayoutManager)null);
        this.JBjugar = new JButton("JUGAR");
        this.JBjugar.setBounds(800, 460, 280, 80);
        this.add(this.JBjugar);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
