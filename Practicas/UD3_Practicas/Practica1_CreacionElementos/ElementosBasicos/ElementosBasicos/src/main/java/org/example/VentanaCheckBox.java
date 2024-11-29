package org.example;

import javax.swing.*;

public class VentanaCheckBox {
    private static JFrame ventana = new JFrame();

    public static void ventana() {
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        ventana.setLayout(new java.awt.GridLayout(4, 1));
        JCheckBox queso = new JCheckBox("Queso Extra");
        JCheckBox peperoni = new JCheckBox("Pepperoni");
        JCheckBox aceitunas = new JCheckBox("Aceitunas");

        JButton botonConfirmar = new JButton("Pedir");
        botonConfirmar.addActionListener(e -> {
            String msg = "Tu pizza con ";
            if (queso.isSelected()) {
                msg += "queso ";
            }
            if (peperoni.isSelected()) {
               msg +=  "peperoni ";
            }
            if (aceitunas.isSelected()) {
                msg += "aceitunas ";
            }
            System.out.println(msg + " se ha enviado.");
        });

        ventana.add(queso);
        ventana.add(peperoni);
        ventana.add(aceitunas);
        ventana.add(botonConfirmar);

        ventana.setVisible(true);
    }
    public static void cerrar(){
        ventana.dispose();
    }
}
