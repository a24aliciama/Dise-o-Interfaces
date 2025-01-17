package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VentanaNombre {

    static JFrame ventana = new JFrame();;

    public static void ventana(){
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);

        JPanel panel = new JPanel();
        ventana.add(panel);

        panel.setLayout(new java.awt.GridLayout(2, 1));

        JTextField nombre = new JTextField("Introduce tu nombre");
        nombre.setForeground(Color.GRAY);

        nombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nombre.getText().equals("Introduce tu nombre")) {
                    nombre.setText("");
                    nombre.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (nombre.getText().isEmpty()) {
                    nombre.setText("Introduce tu nombre");
                    nombre.setForeground(Color.GRAY);
                }
            }
        });

        panel.add(nombre);

        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(e -> {

            if (!nombre.getText().equals("Introduce tu nombre") && !nombre.getText().trim().isEmpty()) {
                System.out.println("Hola " + nombre.getText());
            } else {
                System.out.println("No se ha introducido un nombre.");
            }
        });
        botonEnviar.setVisible(true);

        panel.add(botonEnviar);

        ventana.setVisible(true);

        SwingUtilities.invokeLater(nombre::transferFocus); //para que no enfoque nada mas abrir la ventana
    }

    public static void cerrar(){
        ventana.dispose();
    }
}
