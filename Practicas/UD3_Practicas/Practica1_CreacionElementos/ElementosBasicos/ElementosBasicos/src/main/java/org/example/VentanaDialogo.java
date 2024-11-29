package org.example;

import javax.swing.*;

public class VentanaDialogo {

    static JFrame ventana = new JFrame();

    public static void ventana() {

        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JButton botonEdad = new JButton("Edad");
        botonEdad.addActionListener(e -> {
            String edad = JOptionPane.showInputDialog("Pon tu edad: ");
            JOptionPane.showMessageDialog(null, "Tienes " + edad + " años");
        });
        botonEdad.setVisible(true);

        panel.add(botonEdad);

        ventana.setVisible(true);

    }

    public static void cerrar(){
        ventana.dispose();
    }
}
