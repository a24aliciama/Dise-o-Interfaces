package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Ventana  extends JFrame {

    Color rojo = new Color(205, 92, 92);
    Color amarillo = new Color(222, 186, 101);

    GridBagConstraints gbc = new GridBagConstraints();


    JPanel pan1 = new JPanel(new GridBagLayout());
    JLabel header = new JLabel("<Header>");

    JPanel pan2 = new JPanel(new GridBagLayout());
    JLabel footer = new JLabel("<Footer>");

    JPanel pan3 = new JPanel(new BorderLayout());

        JPanel pan31 = new JPanel(new GridBagLayout());
        JLabel nav = new JLabel("<Nav>");

        JPanel pan32 = new JPanel(new GridBagLayout());
        JLabel aside = new JLabel("<Aside>");

        JPanel pan33 = new JPanel(new BorderLayout());
        JLabel section = new JLabel("<Section>");

            JPanel pan331 = new JPanel(new BorderLayout());


    public static void main(String[] args) {

        Ventana Vbasica = new Ventana();

    }

    public Ventana() {

        //ajustamos frame
        setTitle("Basica");
        setBackground(Color.WHITE);
        setExtendedState(MAXIMIZED_BOTH);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //layout
        setLayout(new BorderLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        //colocamos paneles
        //HEADER
        pan1.setPreferredSize(new Dimension(this.getWidth(),200));
        pan1.setBackground(rojo);
        pan1.setBorder(new MatteBorder(5,5,0,5, Color.WHITE));
        pan1.add(header, gbc);

        add(pan1,BorderLayout.NORTH);

        //FOOTER
        pan2.setPreferredSize(new Dimension(this.getWidth(),200));
        pan2.setBorder(new MatteBorder(0,5,5,5, Color.WHITE));
        pan2.setBackground(rojo);
        pan2.add(footer, gbc);

        add(pan2,BorderLayout.SOUTH);

        //Panel central
        pan3.setPreferredSize(new Dimension(this.getWidth(),this.getHeight()));
        pan3.setBorder(new MatteBorder(20,5,20,5, Color.WHITE));

        add(pan3, BorderLayout.CENTER);

            //nav
            pan31.setBackground(rojo);
            pan31.add(nav, gbc);
            pan31.setPreferredSize(new Dimension(200,pan3.getHeight()));
            pan31.setBorder(new MatteBorder(0,0,0,20, Color.WHITE));

            pan3.add(pan31, BorderLayout.WEST);

            //aside
            pan32.setBackground(rojo);
            pan32.add(aside, gbc);
            pan32.setPreferredSize(new Dimension(200,pan3.getHeight()));
            pan32.setBorder(new MatteBorder(0,20,0,0, Color.WHITE));

            pan3.add(pan32, BorderLayout.EAST);

            //Section
            pan33.setBackground(rojo);
            pan33.add(section, BorderLayout.NORTH);
            pan33.setPreferredSize(new Dimension(500,pan3.getHeight()));
            //pan33.setBorder(new MatteBorder(0,0,0,0, Color.WHITE));

            pan3.add(pan33, BorderLayout.CENTER);

                //Section
                pan331.setBackground(Color.white);
                pan331.setPreferredSize(new Dimension(pan33.getWidth(), pan33.getHeight()));
                pan331.setBorder(new MatteBorder(5,5,5,5,Color.red));

                pan33.add(pan331, BorderLayout.CENTER);




        setVisible(true);

    }
}
