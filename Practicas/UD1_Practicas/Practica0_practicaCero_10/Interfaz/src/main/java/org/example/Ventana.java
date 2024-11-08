package org.example;
import javax.swing.*;
import java.awt.*;

public class Ventana  extends JFrame {

    public Ventana() {
        setTitle("PRUEBA");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       // setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Evento e = new Evento();

        setVisible(true);
        {
            add(e);
            setVisible(true);
        }
    }

}
