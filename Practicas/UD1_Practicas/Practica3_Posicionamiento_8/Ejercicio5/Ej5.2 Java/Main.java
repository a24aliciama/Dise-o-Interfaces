package org.example;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JFrame {
    //colores
    Color menta = new Color(76,235,169);
    Color rojo = new Color(254,0,0);
    Color naranja = new Color(255,109,0);
    Color fucsia = new Color(240,0,255);
    Color verde = new Color(56,120,0);
    Color azul = new Color(1,80,159);
    Color dorado = new Color(202,158,97);

    public static void main(String[] args) {
        Main ventana = new Main();
    }

    public Main() {
        //ventana

        setTitle("Posicionamiento5");
        setBackground(Color.WHITE);
        setExtendedState(MAXIMIZED_BOTH);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //layout
        setLayout(new BorderLayout());

        //Panel izq
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.setPreferredSize(new Dimension(700, this.getHeight()));
        add(p2,BorderLayout.EAST);

            //panel verde
            JPanel pverde = new JPanel();
            pverde.setBackground(verde);
            pverde.setLayout(new BorderLayout());
            pverde.setPreferredSize(new Dimension(this.getWidth(),300));
            pverde.setBorder(new MatteBorder(10,10,10,10,Color.WHITE));
            p2.add(pverde,BorderLayout.NORTH);

            //panel azul
            JPanel pazul = new JPanel();
            pazul.setBackground(azul);
            pazul.setLayout(new BorderLayout());
            pazul.setPreferredSize(new Dimension(this.getWidth(),400));
            pazul.setBorder(new MatteBorder(10,10,10,10,Color.WHITE));
            p2.add(pazul,BorderLayout.CENTER);

            //panel dorado
            JPanel pdorado = new JPanel();
            pdorado.setBackground(dorado);
            pdorado.setLayout(new BorderLayout());
            pdorado.setPreferredSize(new Dimension(this.getWidth(),100));
            pdorado.setBorder(new MatteBorder(10,10,10,10,Color.WHITE));
            p2.add(pdorado,BorderLayout.SOUTH);

        //Panel derecha
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        p3.setPreferredSize(new Dimension((Toolkit.getDefaultToolkit().getScreenSize().width - 700), this.getHeight()));
        add(p3,BorderLayout.WEST);

            //panel menta
            JPanel pmenta = new JPanel();
            pmenta.setBackground(menta);
            pmenta.setLayout(new BorderLayout());
            pmenta.setPreferredSize(new Dimension(this.getWidth(),450));
            pmenta.setBorder(new MatteBorder(10,10,10,10,Color.WHITE));
            p3.add(pmenta,BorderLayout.NORTH);

            //panel abajo
            JPanel p4 = new JPanel();
            p4.setLayout(new BorderLayout());
            p4.setPreferredSize(new Dimension((Toolkit.getDefaultToolkit().getScreenSize().width - 700), this.getHeight()));
            p3.add(p4,BorderLayout.SOUTH);

                //panel fucsia
                JPanel pfucsia = new JPanel();
                pfucsia.setBackground(fucsia);
                pfucsia.setLayout(new BorderLayout());
                pfucsia.setPreferredSize(new Dimension(800,this.getHeight()));
                pfucsia.setBorder(new MatteBorder(10,10,10,10,Color.WHITE));
                p4.add(pfucsia,BorderLayout.EAST);

                //panel derecha abajo
                JPanel p5 = new JPanel();
                p5.setLayout(new BorderLayout());
                p5.setPreferredSize(new Dimension((this.getWidth()-800), this.getHeight()));
                p4.add(p5,BorderLayout.WEST);

                    //panel rojo
                    JPanel projo = new JPanel();
                    projo.setBackground(rojo);
                    projo.setLayout(new BorderLayout());
                    projo.setPreferredSize(new Dimension(this.getWidth(),700));
                    projo.setBorder(new MatteBorder(10,10,10,10,Color.WHITE));
                    p5.add(projo,BorderLayout.NORTH);

                    //panel naranja
                    JPanel pnaranja = new JPanel();
                    pnaranja.setBackground(naranja);
                    pnaranja.setLayout(new BorderLayout());
                    pnaranja.setPreferredSize(new Dimension(this.getWidth(),this.getHeight()-700));
                    pnaranja.setBorder(new MatteBorder(0,10,10,10,Color.WHITE));
                    p5.add(pnaranja,BorderLayout.SOUTH);



    }

}