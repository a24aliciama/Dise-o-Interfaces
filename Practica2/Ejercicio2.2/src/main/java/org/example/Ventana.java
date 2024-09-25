package org.example;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

import static java.awt.Font.BOLD;

public class Ventana  extends JFrame {

    Color rojo = new Color(205, 92, 92);
    Color amarillo = new Color(189, 183, 107);

    Font fuente = new Font("Arial", BOLD, 24);

    GridBagConstraints gbc = new GridBagConstraints();
    GridBagConstraints gbc1 = new GridBagConstraints();
    GridBagConstraints gbc2 = new GridBagConstraints();

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

            JPanel pan331 = new JPanel(new GridBagLayout());

            JPanel pan332 = new JPanel(new BorderLayout());

                JPanel pan3321 = new JPanel(new GridBagLayout());
                JLabel headerS = new JLabel("<Header>");

                JPanel pan3322 = new JPanel(new GridBagLayout());
                JLabel article = new JLabel("<Article>");

                JPanel pan3323 = new JPanel(new GridBagLayout());
                JLabel footerS = new JLabel("<Footer>");


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
        gbc.gridy =  0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        //labels
        header.setFont(fuente);
        header.setForeground(Color.white);

        footer.setFont(fuente);
        footer.setForeground(Color.white);

        nav.setFont(fuente);
        nav.setForeground(Color.white);

        aside.setFont(fuente);
        aside.setForeground(Color.white);

        section.setFont(fuente);
        section.setForeground(Color.white);

        article.setFont(fuente);
        article.setForeground(Color.white);

        headerS.setFont(fuente);
        headerS.setForeground(Color.white);

        footerS.setFont(fuente);
        footerS.setForeground(Color.white);

        //colocamos paneles
        //HEADER
        pan1.setPreferredSize(new Dimension(this.getWidth(),150));
        pan1.setBackground(rojo);
        pan1.setBorder(new MatteBorder(5,5,0,5, Color.WHITE));
        pan1.add(header, gbc);


        add(pan1,BorderLayout.NORTH);

        //FOOTER
        pan2.setPreferredSize(new Dimension(this.getWidth(),150));
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
            pan31.setPreferredSize(new Dimension(300,pan3.getHeight()));
            pan31.setBorder(new MatteBorder(0,0,0,20, Color.WHITE));

            pan3.add(pan31, BorderLayout.WEST);

            //aside
            pan32.setBackground(rojo);
            pan32.add(aside, gbc);
            pan32.setPreferredSize(new Dimension(300,pan3.getHeight()));
            pan32.setBorder(new MatteBorder(0,20,0,0, Color.WHITE));

            pan3.add(pan32, BorderLayout.EAST);

            //Section
            pan33.setBackground(rojo);
            pan33.setPreferredSize(new Dimension(500,pan3.getHeight()));

            pan3.add(pan33, BorderLayout.CENTER);

                //Section
                pan331.setBackground(rojo);
                pan331.add(section,gbc);
                pan331.setPreferredSize(new Dimension(pan33.getWidth(), 70));

                pan33.add(pan331, BorderLayout.NORTH);

                //Section
                pan332.setBackground(rojo);
                pan332.setPreferredSize(new Dimension(pan33.getWidth(), 600));

                pan33.add(pan332, BorderLayout.SOUTH);

                    //headerS
                    pan3321.setBackground(amarillo);
                    pan3321.add(headerS, gbc);
                    pan3321.setPreferredSize(new Dimension(pan332.getWidth(),100));
                    pan3321.setBorder(new MatteBorder(0,20,20,20, rojo));

                    pan332.add(pan3321, BorderLayout.NORTH);

                    //article
                    pan3322.setBackground(amarillo);
                    pan3322.add(article, gbc);
                    pan3322.setPreferredSize(new Dimension(pan332.getWidth(),50));
                    pan3322.setBorder(new MatteBorder(0,20,20,20, rojo));

                    pan332.add(pan3322, BorderLayout.CENTER);

                    //footerS
                    pan3323.setBackground(amarillo);
                    pan3323.add(footerS, gbc);
                    pan3323.setPreferredSize(new Dimension(pan332.getWidth(),100));
                    pan3323.setBorder(new MatteBorder(0,20,20,20, rojo));

                    pan332.add(pan3323, BorderLayout.SOUTH);
                    
        setVisible(true);

    }
}
