package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VentanaTextoEtiqueta {
    public static void ventana(){
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setResizable(false);


        ventana.setLayout(new java.awt.GridLayout(5, 1));

        JLabel nombreLabel = new JLabel("Nombre:");
        ventana.add(nombreLabel);

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

        ventana.add(nombre);

        JLabel apellidoLabel = new JLabel("Apellido:");
        ventana.add(apellidoLabel);

        JTextField apellido = new JTextField("Introduce tu apellido");
        apellido.setForeground(Color.GRAY);

        apellido.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (apellido.getText().equals("Introduce tu apellido")) {
                    apellido.setText("");
                    apellido.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (apellido.getText().isEmpty()) {
                    apellido.setText("Introduce tu apellido");
                    apellido.setForeground(Color.GRAY);
                }
            }
        });

        ventana.add(apellido);

        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(e -> {

            if (!nombre.getText().equals("Introduce tu nombre") && !nombre.getText().trim().isEmpty()
                && !apellido.getText().equals("Introduce tu apellido") && !apellido.getText().trim().isEmpty()) {

                System.out.println("Hola "  + nombre.getText() + " " + apellido.getText());
            } else {
                System.out.println("No se han introducido todos los datos.");
            }
        });
        botonEnviar.setVisible(true);

        ventana.add(botonEnviar);

        ventana.setVisible(true);

        SwingUtilities.invokeLater(nombre::transferFocus); //para que no enfoque nada mas abrir la ventana
        SwingUtilities.invokeLater(apellido::transferFocus);
    }
}