package org.example;

import javax.swing.*;
import java.awt.*;

public class Ventana  extends JFrame {

    Color rojo = new Color(205, 92, 92);
    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();

    public Ventana() {
            setTitle("Basica");
            setBounds(0, 0, 1920, 1080);
            setResizable(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            pan1.setBackground(Color.gray);
            add(pan1);

            pan2.setSize(1920,200);
            pan2.setBackground(rojo);
            pan1.add(pan2);

            Panel e = new Panel();




            setVisible(true){
                add(e);
        }

        }
}
