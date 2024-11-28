package org.example;

import javax.swing.*;

public class VentanaDialogo {
    public static void ventana() {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JButton botonEdad = new JButton("Edad");
        botonEdad.addActionListener(e -> {
            String edad = JOptionPane.showInputDialog("Pon tu edad: ");
            JOptionPane.showMessageDialog(null, "Tienes " + edad + " años");
        });
        botonEdad.setVisible(true);

        ventana.add(botonEdad);

        ventana.setVisible(true);

    }
}
